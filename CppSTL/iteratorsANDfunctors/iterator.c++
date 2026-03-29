#include<bits/stdc++.h>
using namespace std;
//An iterator is an object that behaves like a pointer to traverse and access elements of a container
int main(){
//begin()
//end()
//cbegin() -> return constant iterator (read only) cannot change the value of pointing el.
//cend() 
// rbegin() : Returns a reverse iterator to the beginning of container.
// rend() : Returns a reverse iterator to the theoretical element just after the last element of the container.

//crbegin()
//crend()


//Subtracting Another Iterator:
vector<int> v = {10, 20, 30, 40, 50};
auto it1 = v.begin();
auto it2 = v.begin() + 3;
cout << "Distance between it1 and it2: " << it2 - it1 << endl;


//Comparing Iterators:
//We can compare two iterators of the same container to see their relationship. ->>==, !=, <, >, <=, and >=
vector<int> arr;
//backward movement:
vector<int>::iterator it = arr.end(); //yeh last ko point toh phale hame -- tan cout agar ophale cout tha arr.end()-1;

while(it != arr.begin()){
    it--;
    cout << *it << ' ';
}



return 0;
}