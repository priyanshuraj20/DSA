/*Map:
    2 types of map:
    1}Ordered Map:data sorted order mein milta -> saare operation o(logn) time mein hote

    2}unordered map:data sorted order mein nahi milta -> saare operation o(1) mein hojate 



*/
#include<bits/stdc++.h>
using namespace std;
int main(){

    //creation:
    unordered_map<string, string> table;
    //insertion:
    table["in"] = "India";//tarika1
    table.insert(make_pair("en","england"));


    // pair banakar:tarika3 
    pair<string,string> p;
    p.first = "br";
    p.second = "brazil";

    table.insert(p);

    table.size();
    table.clear(); //saari entry haat gyi hogi

    table.at("in"); //map ke andar jo "in" key hain uski value kiya hain ->India ayega

    //value update :
    table.at("in") = "india2";
    //ek aur tarika:
    table["in"] = "India";

    //iterator:
    unordered_map<string,string>:: iterator it = table.begin();

    while(it != table.end()){
        pair<string,string> p = *it;
        cout << p.first << " " << p.second;
        it++;
    }

    //erase:
   table.erase(table.begin(),table.end());


    //find(const key)::::Return an iterator to the element with the given key, or end() if the key is not found
    if(table.find("in") != table.end()){
        cout << "Key found"<<" ";
    }else{
        cout << "Key not found";
    }


    //count(key):return number of elemet with specified key.(0 or 1 as key unique 1->found 0 ->not found)
    if(table.count("in") == 0){
        cout << "Key not found";
    }else{
        cout << "Key found";

    }


    //ordered map: sorted
    map<string,string> tb;
    //sab chiz same hain jo uoar seekhe :sirf complexity o(logn) hota 
    //print mein: sorted order aata







}