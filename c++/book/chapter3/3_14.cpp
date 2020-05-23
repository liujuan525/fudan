/*
 * @Descripttion: 内联函数举例：求圆的面积
 * @Author: may
 * @Date: 2020-04-25 17:35:35
 */
#include <iostream>
using namespace std;

const double PI = 3.14159265358979;

inline double calArea(double radius)
{
    return PI * radius * radius;
}

int main()
{
    double r = 3.0;
    double area = calArea(r);
    cout<<area<<endl;


    return 0;
}


