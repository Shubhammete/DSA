#include <iostream>
using namespace std;
int checkdigits(int no, int ans){
    while(no>0){
        no = no/10;
        ans = ans + 1;
    }
    return ans;
}
int main() {
    int no = 522234;
    int ans = 0;
    cout << checkdigits(no, ans);

    return 0;
}
