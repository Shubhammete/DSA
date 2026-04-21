#include <iostream>
int fibo(int no){
    if (no == 0){
        return 0;
    }
    if (no == 1){
        return 1;
    }
    return fibo(no - 1) + fibo(no - 2);
}
int main() {
    int no = 5;
    for (int i = 0; i < no ; i++){
        std::cout << fibo(i);
    }

    return 0;
}
