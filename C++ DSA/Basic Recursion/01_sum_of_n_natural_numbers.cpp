#include <iostream>
int sum(int no){
    if (no == 1){
        return no;
    }
    return no + sum(no - 1);
}
int main() {
    int no = 3;
    int ans = sum(no);
    std::cout << ans;

    return 0;
}
