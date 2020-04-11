/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
// 2-35:输出九九乘法算表
#include <iostream>
using namespace std;

int main()
{
    for (int i = 1; i < 10; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout<<j<<"*"<<i<<"="<<i*j<<"  ";
        }
        cout<<"\n";
    }
    cout<<endl;

    return 0;
}

