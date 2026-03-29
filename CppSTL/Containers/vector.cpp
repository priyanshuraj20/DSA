#include<bits/stdc++.h>
using namespace std;
//vector:dynamic array
int main(){
    //creation:
    vector<int> marks;

    vector<int> miles(10); //size 

    vector<int> mark(15,0);

    //functions:
    miles.begin();//pointing at first element of vector
    cout << *(miles.begin()) << endl;
    //swap:
    vector<int> first;
    vector<int> second;
    first.push_back(10);
    first.push_back(11);
    second.push_back(120);
    second.push_back(130);
    first.swap(second); 
    cout << first[0] << " "<< first[1]; // 120 130 ayega 
    for(int i : first){
        cout << i <<" ";
    }
    //traversing vector using iterator:
    //step1: create an iterator:
    vector<int>::iterator it = first.begin();
    while(it != first.end()){
        cout << *it << " ";
        it++;
    }



    miles.end();
    miles.size();
    miles.empty();
    miles.clear(); //remove all element of vector

    //insert at vector:
    miles.push_back(20);
    miles.pop_back(); //piche wala element!

    //front element:
    cout<<miles.front() << endl;
    cout<<miles.back() << endl;
        //insert function:
        marks.insert(marks.begin(),50);
        
    ///accesing and Modifying with sq. bracket:
    cout << marks[0] <<endl; //access
    //or: at function:
    cout << marks.at(0) <<endl;
    marks[0] = 100;  //modify
    //size must be assigned yeh fir vector mein kuch hoo

    //capacity :at these time iski kitna max capacity hain:
    cout<<marks.capacity() << endl;
    //reserve: min capacity itni honi hi cahaiye:
    vector<int> home;
    home.reserve(10);  //abb size 10 ayega min itna reserve hogya 
    //max_size:mera system max kitna size kya hain 
     cout << marks.max_size() << endl;


     //2d vector:
     vector<vector<int>>  arr(4,vector<int>(5,0));  //2d array create with 4 rows and 5 col with intial value of 0.
     
    int total_rows = arr.size();
    int total_col = arr[0].size();


    //bagged array
    vector<vector<int>> arr2(4);
    arr2[0] = vector<int>(4);  //4size
    arr[1] = vector<int>(2);  //2size
    arr[2] = vector<int>(3);  //3size
    arr[3] = vector<int>(1);  //1size



      

return 0;
}