
import java.util.*;

public class wordladderII{

    public static List<List<String>> wordLadderII(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);
        List<List<String>> ans = new ArrayList<>();

        if (!set.contains(endWord)) {
            return ans;
        }

        Queue<List<String>> q = new LinkedList<>();

        List<String> start = new ArrayList<>();
        start.add(beginWord);
        q.offer(start);

        List<String> usedOnLevel = new ArrayList<>();
        int level = 1;

        while (!q.isEmpty()) {

            List<String> curr = q.poll();

            // level change detect
            if (curr.size() > level) {
                level = curr.size();
                for (String w : usedOnLevel) {
                    set.remove(w);
                }
                usedOnLevel.clear();
            }

            String word = curr.get(curr.size() - 1);

            // reached endWord
            if (word.equals(endWord)) {
                if (ans.size() == 0) {
                    ans.add(curr);
                } else if (ans.get(0).size() == curr.size()) {
                    ans.add(curr);
                }
                continue;
            }

            char[] ch = word.toCharArray();

            for (int i = 0; i < ch.length; i++) {
                char original = ch[i];

                for (char c = 'a'; c <= 'z'; c++) {
                    ch[i] = c;
                    String next = new String(ch);

                    if (set.contains(next)) {
                        List<String> temp = new ArrayList<>(curr);
                        temp.add(next);

                        q.offer(temp);
                        usedOnLevel.add(next);
                    }
                }

                ch[i] = original;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        List<List<String>> res = wordLadderII(beginWord, endWord, wordList);

        for (List<String> path : res) {
            System.out.println(path);
        }
    }
}


//optimized:


class WordLadder2Optimized {

    public static ArrayList<ArrayList<String>> wordLadderII(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);
        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        if (!set.contains(endWord)) {
            return ans;
        }

        // Step 1: BFS
        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> level = new HashMap<>();

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        level.put(beginWord, 0);

        int wordLen = beginWord.length();

        while (!q.isEmpty()) {
            String word = q.poll();
            int currLevel = level.get(word);

            char[] ch = word.toCharArray();

            for (int i = 0; i < wordLen; i++) {
                char original = ch[i];

                for (char c = 'a'; c <= 'z'; c++) {
                    ch[i] = c;
                    String next = new String(ch);

                    if (set.contains(next)) {

                        if (!level.containsKey(next)) {
                            level.put(next, currLevel + 1);
                            q.offer(next);
                        }

                        if (level.get(next) == currLevel + 1) {
                            map.computeIfAbsent(next, k -> new ArrayList<>()).add(word);
                        }
                    }
                }
                ch[i] = original;
            }
        }

        // Step 2: DFS
        List<String> path = new ArrayList<>();
        dfs(endWord, beginWord, map, level, path, ans);

        return ans;
    }

    static void dfs(String word, String beginWord,
            Map<String, List<String>> map,
            Map<String, Integer> level,
            List<String> path,
            ArrayList<ArrayList<String>> ans) {

        path.add(word);

        if (word.equals(beginWord)) {
            ArrayList<String> temp = new ArrayList<>(path);
            Collections.reverse(temp);
            ans.add(temp);
        } else {
            if (map.containsKey(word)) {
                for (String parent : map.get(word)) {
                    dfs(parent, beginWord, map, level, path, ans);
                }
            }
        }

        path.remove(path.size() - 1);
    }
}
