//Approach: hame ek beginWord diya aur ek endWord and list of string hame woh begin word se end word tak jana toh kitne transformation lagega woh return look hum given list ko set mein daldiye :
//agar hum begin word ko queue mein dale and then uss to ko char array convert karke and har char uss ko a-z tak iterate kare and agar koi word set me mila toh queu mein usse daldete and set se remove and jab bhi jaise milta endword return length

import java.util.*;

public class wordLadder {

    static class Pair {

        String word;
        int length;

        Pair(String w, int l) {
            this.word = w;
            this.length = l;
        }
    }

    public static int wordLadderI(String beginWord, String endWord, ArrayList<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        HashSet<String> set = new HashSet<>();
        for (String s : wordList) {
            set.add(s);
        }
        if(!set.contains(endWord)) return 0;
        q.offer(new Pair(beginWord, 1));
        set.remove(beginWord);
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            String c = curr.word;
            int l = curr.length;
            if (c.equals(endWord)) {
                return l;
            }
            char ch[] = c.toCharArray();
            for (int j = 0; j < ch.length; j++) {
                char o = ch[j];
                for (char i = 'a'; i <= 'z'; i++) {
                    if(i == o) continue;
                    ch[j] = i;
                    String substr = new String(ch);
                    if (set.contains(substr)) {
                        q.offer(new Pair(substr, l + 1));
                        set.remove(substr);
                    }
                    ch[j] = o;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        int ans = wordLadderI(beginWord, endWord, wordList);
        System.out.println(ans);

    }
}
