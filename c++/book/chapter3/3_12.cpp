/*
 * @Descripttion: 将两个整数交换次序后输出
 * @Author: may
 * @Date: 2020-04-25 17:35:24
 */
#include <iostream>
using namespace std;

void swap(int &a, int &b)
{
    int tamp = a;
    a = b;
    b = tamp;
}

int main()
{
    int x = 5, y = 10;
    cout<<"x="<<x<<" y="<<y<<endl;
    swap(x, y);
    cout<<"x="<<x<<" y="<<y<<endl;

    return 0;
}
