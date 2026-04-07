#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define endl '\n'

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    string s1 = "abcdba";
    string s2 = "cabdab";
    int n = s1.length();
    vector<int> even1(26,0), odd1(26,0), even2(26,0), odd2(26,0);
    for(int i =0; i < n; i++){
        if(i % 2 == 0){
            even1[s1[i]-'a']++;
            even2[s1[i]-'a']++;
        }else{
            odd1[s1[i]-'a']++;
            odd2[s1[i]-'a']++;
        }
    }
    return even1 == even2 && odd1 == odd2;

    
    return 0;
}
/*hame doh strings s1 and s2 diye hain and hame s1 and s2 ko check karna equal hoskta yeh nahi : operation: you can swap any char of index i ,j where index j - i must be even
THINKING: agar hum aisa soche ki agar index abhi even hain toh kon se index se swap kar skte ofcus even <-> even se hoga and odd <-> odd index  se hoga.
toh agar mano s1 mein even indexs par a,b,c hain  koi bhi index but even and  s2 mein bhi a,b,c koi bhi index toh hum swap kar skte and char s1 and s2 equal hoskta  and same for odd. mtlb kya ki s1 mein a,b,c koi bhi even index pe para and s2 mein bhi toh mano s1[i]-> a and s2[i] -> c toh even pain c hain hnn toh ho skta . Toh bascially hum freq vctor banaye s1 even and s2 even and dono equal toh and odd bhi s1 and s2 equal toh true.


*/