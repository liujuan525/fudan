/*
 * @Author: may
 * @Date: 2020-04-13 08:09:39
 */
// 3-3：编写程序求 π 的值，公式如下 π = 16arctan(1/5)-4arctan(1/239) 其中 arctan 用如下形式的级数计算：
// arctanx = x - x3/3 + x5/5 - x7/7 +... 直到级数某项绝对值不大于10(-15)为止，π 与 x 均为 double 型
#include <iostream>
using namespace std;

double arctan(double x)
{
    double sqr = x * x;
    double e = x; // e 为分母
    double r = 0;
    int i = 1; // i 为分子
    while (e / i > 1e-15)
    { 
        double f = e / i;
        r = (i % 4 == 1) ? r + f : r - f;
        e = e * sqr;
        i += 2;
    }
    return r;
}

int main()
{
    double a = 16.0 * arctan(1 / 5.0);
    double b = 4.0 * arctan(1 / 239.0);
    // 整数相除结果取整
    cout<<"PI="<<a-b<<endl;

    return 0;
}


