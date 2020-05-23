/*
 * @Descripttion: 带默认形参值的函数举例，求长方体的体积
 * @Author: may
 * @Date: 2020-04-25 17:36:00
 */
#include <iostream>
#include <iomanip>
using namespace std;

int getVolume(int length, int width = 2, int height = 3);

int main()
{
    const int x = 10, y = 12, z = 15;
    cout<<"some box data is ";
    cout<<getVolume(x, y, z)<<endl;
    cout<<"some box data is ";
    cout<<getVolume(x, y)<<endl;
    cout<<"some box data is ";
    cout<<getVolume(x)<<endl;

    return 0;
}

int getVolume(int length, int width/* = 2 */, int height/* = 3 */)
{
    cout<<setw(5)<<length<<setw(5)<<width<<setw(5)<<height<<"\t";
    return length * width * height;
}


