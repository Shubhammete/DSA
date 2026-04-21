#include <bits/stdc++.h>
using namespace std;
void table(int no, int start){
    if (start == 11){
        return ;
    }
    cout << no << " x " << start << " = " << no*start << endl;
    table(no, start+1);
}
int main() {
    int no = 5;
    int start = 1;
    table(no, start);

    return 0;
}
