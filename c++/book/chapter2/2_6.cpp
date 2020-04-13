#include <iostream>
using namespace std;

// 输入一个整数，将各位数字反转后输出
int main() {
    int n, right_digit, newnum=0;
    n = 3542;

    cout<<"The reverse number is";
    do
    {
        right_digit = n % 10;
        cout<<right_digit;
        n /= 10;
    } while (n != 0);
    
    cout<<endl;

    return 0;
}