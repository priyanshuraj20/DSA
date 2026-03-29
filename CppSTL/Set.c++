/*Set: Unordered->o(1) || ordered -> o(log n)*/
#include<bits/stdc++.h>
using namespace std;
int main(){
    unordered_set<int> st;  //unoredered
    st.insert(15);
    st.insert(16);
    st.insert(18);
    st.insert(14);

    //traverse:
    unordered_set<int>::iterator it = st.begin();
    while(it != st.end()){
        cout << *it << " ";
        it++;
    }
    st.begin();
    st.end();

    st.empty();
    st.size();
    st.clear();
    st.erase(st.begin(),st.end());
    
    st.find(10); // return an itertor to the element with the given key or end() if the key is not found.

    st.count(10); // return the no. of elememt with the specifioed key(1 or 0)

    //ordered set: o(logn)
    set<int> st2;
    //sab same hi 


}