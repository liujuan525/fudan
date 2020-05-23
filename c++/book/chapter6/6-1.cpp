/*
 * @Descripttion: 数组的声明与使用
 * @Author: may
 * @Date: 2020-05-23 14:07:48
 */ 
#include <iostream>
using namespace std;

int main()
{
    int a[10], b[10];
    for (int i = 0; i < 10; i++)
    {
        a[i] = i * 2 - 1;
        b[10-i-1] = a[i];
    }
    for (int i = 0; i < 10; i++)
    {
        cout<<"a["<<i<<"]="<<a[i]<<" ";
        cout<<"b["<<i<<"]="<<b[i]<<endl;
    }
    

    return 0;
}