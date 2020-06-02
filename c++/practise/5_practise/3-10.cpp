/*
 * @Descripttion: 3-10：编写函数求两个整数的最大公约数和最小公倍数
 * @Author: may
 * @Date: 2020-05-31 19:42:03
 */ 
#include <iostream>
using namespace std;

// 求两个整数的最大公约数
int fn1(int i, int j);

int main()
{
    int x, y;
    int i, j;
    cout<<"请输入一个整数:";
    cin>>i;
    cout<<"请输入另一个整数:";
    cin>>j;
    x = fn1(i, j);
    y = i * j / x;

    cout << i << "和" << j << "的最大公约数是：" << x << endl;
    cout << i << "和" << j << "的最小公倍数是：" << y << endl;

    return 0;
}

int fn1(int i, int j)
{
    int temp;
    if (i < j)
    {
        temp = i;
        i = j;
        j = temp;
    }

    while (j != 0)
    {
        temp = i % j;
        i = j;
        j = temp;
    }
    return i;
}
