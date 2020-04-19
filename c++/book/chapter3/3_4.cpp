/*
 * @Author: may
 * @Date: 2020-04-13 08:09:39
 */
// 寻找并输出 11-999 之间的数 m，它满足 m,m2 和 m3 均为回文数
// 回文数：其各位数字左右对称的整数。如 121，1331
#include <iostream>
using namespace std;

bool symm(unsigned n) 
{
    unsigned i = n;
    unsigned m = 0;
    while (i > 0)
    {
        m = m * 10 + i % 10;
        i /= 10;
    }
    return m == n;
}

int main()
{
    for (unsigned m = 11; m < 1000; m++)
    {
        if (symm(m) && symm(m * m) && symm(m * m * m))
        {
            cout<<"m="<<m;
            cout<<" m*m="<<m*m;
            cout<<" m*m*m="<<m*m*m<<"\n";
        }
    }

    return 0;
}
