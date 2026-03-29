#include<bits/stdc++.h>
using namespace std;

int main() {
    deque<int> dq;
    //insertion:
    dq.push_back(20);//push at back
    dq.push_front(10);//push at front_insert_iterator

    //pop:
    dq.pop_back();

    dq.pop_front();

    dq.size();

    dq.front(); //front elenment

    dq.back(); //last elelmet

    dq.empty();
    dq.clear();


    deque<int>::iterator it = dq.begin();
    while(it != dq.end()){
        cout << *it <<" ";
        it++;
    }

    cout << dq.at(3) << endl;

    //insert: location,val
    dq.insert(dq.begin(),101);


    dq.erase(dq.begin(),dq.end());//dq ke start se lekar end tak erase kar leta

    




    

}