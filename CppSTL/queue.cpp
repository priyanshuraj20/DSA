#include<bits/stdc++.h>
using namespace std;
int main(){

    //creation :
    queue<int> q;
    //insertion
    q.push(10);
    q.push(20);
    q.push(30);

    cout << q.size() << endl;

    q.pop();
    
    //no clear method in queue
    q.empty();

    q.front(); // front element;
    q.back(); //back element;

    //swap as same : two queue : first.swap(second);

    //iterator nahi hota ::

    return 0;
}