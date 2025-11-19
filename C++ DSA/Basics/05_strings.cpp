#include<bits/stdc++.h>

using namespace std;

int main(){

    string a = "Shubham";
    int len = a.size();
    cout << a[len-1]; // m

    // string manipulation is allowed in Cpp
    a[len-1] = 'j';
    cout << a; // shubhaj

    return 0;
}