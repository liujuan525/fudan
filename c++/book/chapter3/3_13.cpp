/*
 * @Descripttion: 值传递与引用传递的比较
 * @Author: may
 * @Date: 2020-04-25 17:35:29
 */
#include <iostream>
#include <iomanip>
using namespace std;

void fiddle(int a, int &b)
{
    a = a + 100;
    b = b + 100;
    cout<<"The values are ";
    cout<<setw(5)<<a;
    cout<<setw(5)<<b<<endl;
}

int main()
{
    int x = 7, y = 12;
    cout<<"The values are ";
    // setw（int n）: 控制输出间隔，是给紧跟着后面的数据预定一个空间，如果该数百据小于这个空间，在左边用0补齐度；setw（）只对紧跟在他后面的数据有效
    cout<<setw(5)<<x;
    cout<<setw(5)<<y<<endl;
    fiddle(x, y);
    cout<<setw(5)<<x;
    cout<<setw(5)<<y<<endl;

    return 0;
}
