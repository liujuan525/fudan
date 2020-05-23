/*
 * @Descripttion: 重载函数应用举例：编写两个名为 sumOfSquare 的重载函数，分别求两整数的平方和及两实数的平方和
 * @Author: may
 * @Date: 2020-04-25 17:36:05
 */
#include <iostream>
using namespace std;

int sumOfSquare(int a, int b)
{
    return a * a + b * b;
}

double sumOfSquare(double a, double b)
{
    return a * a + b * b;
}

int main()
{
    int m, n;
    cout<<"Enter two integers: ";
    cin>>m>>n;
    cout<<"Their sum of square:"<<sumOfSquare(m, n)<<endl;

    double x, y;
    cout<<"Enter two real number: ";
    cin>>x>>y;
    cout<<"Their sum of square:"<<sumOfSquare(x, y)<<endl;
    
    return 0;
}


