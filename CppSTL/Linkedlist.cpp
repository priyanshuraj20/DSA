#include<bits/stdc++.h>
using namespace std;
int main(){
    //creation:
    list<int> myList;
    //insertion:
    myList.push_back(10);//back
    myList.push_back(20);
    myList.push_front(30); //front
    myList.push_back(40);

    myList.pop_back();
    myList.pop_front();

    myList.size();//size
    myList.clear(); //size =0 hojayega

    myList.empty(); //check list is empty?

    myList.front(); //aage wala element dega

    myList.back(); //back wala element dega

    myList.begin(); //point at starting of list
    myList.end(); //point at end of list;
    //we can iterate with the help of these:
    list<int>::iterator it = myList.begin();

    while(it!= myList.end()){
        cout << *it << " ";
        it++;
    }

    //remove(value): remove all element from the list that are equal to the specified value;
    myList.remove(10);

    
    //swap: 
    list<int> first;
    first.push_back(10);
    first.push_back(20);
    first.push_back(30);

    list<int> second;
    second.push_back(100);
    second.push_back(200);
    second.push_back(300);

    first.swap(second);
    //print agar first : 100 200 300

    //insert(iterator,value):insert the new element before the specified position in the list.
first.insert(first.begin(),1000);
//erase: 
first.erase(first.begin(),first.end());





    return 0;

}