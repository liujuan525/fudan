/*
 * @Descripttion: 系统函数应用举例：从键盘输入一个角度值，求出该角度值的正弦值，余弦值和正切值
 * @Author: may
 * @Date: 2020-04-25 17:36:10
 */
#include <iostream>
#include <cmath>
using namespace std;

const double PI = 3.14159265358979;

int main()
{
    double angle;
    cout<<"Please enter an angie:";
    cin>>angle;
    // 转化为弧度值 -- 此处不明白
    double radian = angle * PI / 180;
    cout<<"sin("<<angle<<")="<<sin(radian)<<endl;
    cout<<"cos("<<angle<<")="<<cos(radian)<<endl;
    cout<<"tan("<<angle<<")="<<tan(radian)<<endl;

    return 0;
}