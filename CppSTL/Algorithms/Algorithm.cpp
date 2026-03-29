#include<bits/stdc++.h>
#include<algorithm>
using namespace std;


void printDouble(int a){
    cout << 1*a << " ";
}
bool checkEven(int n){
    return n%2==0;
}
int main(){
    vector<int> v;
    v.push_back(10);
    v.push_back(20);
    
    //searching algo and iteratos and iterating algo.:

    //find(first,last,value)->return an iterator to the element of the value otherwise it returns the end iterator.

    vector<int>::iterator it = find(v.begin(),v.end(),6);
    auto it = find(v.begin(),v.begin()+3,10);


    //for_each:
    for_each(v.begin(),v.end(),printDouble);//vector v ke har element ke liye yeh printDouble call hoga ek ek karke 

    //find_if(start,end,cond.)
    auto it = find_if(v.begin(),v.end(),checkEven);//mtlb koi value nahi find kar rahe , check even ke basis (jo given) cond. mein phale satisfy karega woh milega.
    cout << *it << " ";

    //count(start,end,target):
    int ans = count(v.begin(),v.end(),11);
    cout << ans <<" ";

    //count_if(start,end,cond.)

    int ans = count_if(v.begin(),v.end(),checkEven);

    //sort(start,end) ->by default asc order.

    sort(v.begin(),v.end());
    for(int a : v){
        cout << a <<" ";
    }

    //reverse(start,end):
    reverse(v.begin(),v.end());

    //rotate(first, mid, last):
    //first:iterator to the first element in the range
    //mid:iterator the element that becomes th new first element
    //last:erator to the theoretical element just after the last element in the range.

    //inplace rotation the fun does not return any value
    //array
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int d = 2;
    rotate(arr,arr+d,arr+n); //left rotate
    rotate(arr, arr + n - d,arr + n);

     rotate(v.begin(), next(v.begin(), 2), v.end());  //left;

     rotate(v.begin(),v.begin()+2,v.end());


     //unique(): Removes duplicate elements from a sorted range.
     //ex: 1,1,1,1,2,2,2,3,3 hain toh->1,2,3 ayega - >return itertor jaha tak unqiue
     auto it = unique(v.begin(),v.end());
     //it iterator k phele saare unique element hain!
     //it ke baad saare duplicate element hain
     //erase kardiya duplicate:
     v.erase(it,v.end());
     //abb sirf unique element bacha list mein

     //partition():
     auto it = partition(v.begin(),v.end(),checkEven);
     //list mein partiton ban gya hoga ek side even ek side odd mtlb cond. ki basis pe


     //Numeric algo:

     //accumulate(range,intitalval): Computes the sum of elements in a range.
     int totalSum = accumulate(v.begin(),v.end(),0);
     
     //inner_product(): 2 vector ka product element by element fir sum  [1,2,3] [2,3,4] = 2 + 6+12 = 20
    vector<int> first;
    first[0] = 1;
    first[1] = 2;
    vector<int> second;
    second[0] = 2;
    second[1] = 3;
     int inner = inner_product(first.begin(),first.end(),second.begin(),0);

    //partial_sum():
    vector<int> result(first.size());
    //[1,2,3,4] -> result = [1,3,6,10]
    partial_sum(first.begin(),first.end(),result.begin());  //result ->jaha store karana.


    //iota():maano tera pas list hain tumne bola iota(110)->toh yeh 110 se jaha tak vector hain val bhar deg 110 111 112..
    iota(first.begin(),first.end(),250);








}