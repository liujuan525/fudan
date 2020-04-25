/*
 * @Descripttion: 输入两个整数，取它们的平方和
 * @Author: may
 * @Date: 2020-04-21 22:14:19
 */
#include <iostream>
using namespace std;

int square(int x)
{
    return x * x;
}

int sum(int x, int y)
{
    return square(x) + square(y);
}

int main()
{
    int a, b;
    cout<<"Please enter two integers(a and b):";
    cin>>a>>b;
    cout<<"The sum of square of a and b:"<<sum(a, b)<<endl;

    return 0;
}