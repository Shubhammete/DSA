#include <iostream>
using namespace std;
int checkdigits(int no, int ans){
    if (no == 0){
        return ans;
    }
    ans += 1;
    return checkdigits(no/10, ans);
}
int main() {
    int no = 522234;
    int ans = 0;
    cout << checkdigits(no, ans);

    return 0;
}
