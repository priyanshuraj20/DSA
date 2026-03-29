#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<int> arr;
    arr.push_back(10);
    arr.push_back(20);
    arr.push_back(30);
    arr.push_back(40);
    arr.push_back(50);

    //binary_search():check the value exits.
    int target = 40;
    bool ans = binary_search(arr.begin(),arr.end(),target);

    cout << ans << endl;

    //lower_bound():find the first element greater or equal to a valur in a sorted range.

    auto it = lower_bound(arr.begin(),arr.end(),35);

    cout << *it << endl;

    //upperbound(): just greter than target element.

    auto it = upper_bound(arr.begin(),arr.end(),40);
    cout<< *it << endl;

    //equal_range():finds the range of elements equal to a value in a sorted range.
    //return pair(iteratorFIrst ,iterator SEcond);
    auto range = equal_range(arr.begin(),arr.end(),20);

    //Number of occurence:
    cout<<distance(range.first,range.second) << endl;
    
    //range:
    cout<< distance(arr.begin(),range.first) << "," << distance(range.first,range.second);

    //MIN AND MAX Algorithms:

    auto it = min_element(arr.begin(),arr.end());//min element in a range

    auto it = max_element(arr.begin(),arr.end());// max element in a range.



    int a =45;
    int b =67;
    cout << max(a,b) <<endl;//return max of two values
    cout << min(a,b) <<endl;//return smaller of two values


    //Heap agorithm:
    vector<int> arr2;
    arr2.push_back(10);
    arr2.push_back(20);
    arr2.push_back(30);
    arr2.push_back(40);
    arr2.push_back(50);

    make_heap(arr2.begin(),arr2.end()); // 50 40 30 20 10
    //max heap bnta   o(n)

    arr2.push_back(99); //heap property break kar jati toh hme element insert karne ke baad push_heap() method use karna padega:
    push_heap(arr2.begin(),arr2.end());   //o(logn n)

    //deletion:
    pop_heap(arr2.begin(),arr2.end()); //isse jo max value tha usko last mein bhej deta  o(1)
arr2.pop_back(); // abb vector se hum woh last value klo pop kar diye.


//sort_heap:
sort_heap(arr2.begin(),arr2.end());   //o(n);


//set algorithms:
vector<int> first;
vector<int> second;
first[0] = 1;
first[1] = 2;
first[2] = 3;
second[0] = 4;
second[1] = 5;
second[2] = 6;

//union:
vector<int> result;
set_union(first.begin(),first.end(),second.begin(),second.end(),inserter(result,result.begin()));

set_intersection(first.begin(),first.end(),second.begin(),second.end(),inserter(result,result.begin()));

//set_Difference()
//symmetric_difference()

}