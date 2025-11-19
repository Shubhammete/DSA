#include<bits/stdc++.h>

using namespace std;

int main(){

    // if else
    int age;
    cout << "Input your age: ";
    cin >> age;
    if(age >= 18){
        cout << "You are Adult";
    }
    else if (age < 0){
        cout << "Enter positive value";
    }
    else{
        cout << "You are not Adult";
    }

    //switch

    int day;
    cin >> day;

    switch(day){
        case 1:
            cout << "Monday";
            break;
        case 2:
            cout << "Tuesday";
            break;
        default:
            cout << "Invalid";
            break;
    }
    
    return 0;
}