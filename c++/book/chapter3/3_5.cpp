/*
 * @Author: may
 * @Date: 2020-04-13 08:09:39
 */
// 3_5: 计算公式，输出结果
// fabs->绝对值函数  sqrt->平方根函数
#include <iostream>
// cmath 标准库中对数学函数的声明
#include <cmath>
using namespace std;        

const double TINY_VALUE = 1e-10;

double tsin(double x)
{
    double g = 0;
    double t = x;
    int n = 1;
    do
    {
        g += t;
        n++;
        t = -t * x * x / (2 * n - 1) / (2 * n - 2);
    } while (fabs(t) >= TINY_VALUE);
    return g;
}

int main()
{
    double k, r, s;
    cout<<"r=";
    cin>>r;
    cout<<"s=";
    cin>>s;
    if (r * r <= s * s) {
        k = sqrt(tsin(r) * tsin(r) + tsin(s) * tsin(s));
    } else {
        k = tsin(r * s) / 2;
    }
    cout<<k<<endl;

    return 0;
}




