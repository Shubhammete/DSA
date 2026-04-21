#include <iostream>
int factorial(int no){
    if (no == 1){
        return no;
    }
    return no * factorial(no - 1);
}
int main() {
    int no = 5;
    int ans = factorial(no);
    std::cout << ans;

    return 0;
}
