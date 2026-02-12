#include<bits/stdc++.h>

using namespace std;

// void function -> does not return anything

void print(string name){
    cout << name; 
}

// returns something
int sum(int a, int b){
    return a + b;
}

// pass by value
void random(int a){
    a += 5;
}

void reference(int &a){
    a += 5;
}

int main(){
    print("Shubham");
    sum(2,4);

    // pass by value
    int a = 23;
    random(a);
    cout << a; // it gives 23 and not 27 as just the value copy passed and not the actual reference 
    reference(a);
    cout << a; // now its 27

    // arays always goes by reference!!!!!

    return 0;
}
