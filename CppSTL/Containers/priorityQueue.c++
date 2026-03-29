//PriorityQueue:Adaptor class that provides a (heap).

#include<bits/stdc++.h>
using namespace std;
int main(){
priority_queue<int> pq;//by default max-heap banta;

pq.push(5);    //o(logn)
pq.push(10);
pq.push(55);

//top ele-> Highest priority element:
pq.top(); //55  o(1)

pq.pop(); //highest priority eleemt pop hoga   o(1);
pq.size();

pq.empty();

//min heap:
priority_queue<int,vector<int>,greater<int> > pq2;

pq2.push(100);

}