#include <iostream>
using namespace std;

// 读入一系列整数，统计出正整数个数 i 和负整数个数 j，读入 0 则结束
int main() {
    int i = 0, j = 0, n;
    cout<<"Enter some integers please (enter 0 to quit):"<<endl;
    cin>>n;
    while (n != 0)
    {
        if (n > 0) i += 1;
        if (n < 0) j += 1;
        cin>>n;
    }
    cout<<"Count of positive integers:"<<i<<endl;
    cout<<"Count of negative integers:"<<j<<endl;

    return 0;
}