/*
 * @Descripttion: 3-9：编写函数判别一个数是否是质数，在主程序中实现输入输出
 * 质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数
 * @Author: may
 * @Date: 2020-05-31 19:41:58
 */ 
#include <iostream>
#include <cmath>
using namespace std;

int prime(int i); // 判断一个数是否是质数的函数
int main()
{
    int i;
    cout<<"请输入一个整数：";
    cin>>i;
    if (prime(i))
    {
        cout<<i<<" 是质数"<<endl;
    } else
    {
        cout<<i<<" 不是质数"<<endl;
    }

    return 0;
}

int prime(int i) 
{
    int j, k, flag;
    flag = 1;
    k = sqrt(i);
    for ( j = 2; j <= k; j++)
    {
        if (i % j == 0)
        {
            flag = 0;
            break;
        }
    }
    if (flag)
    {
        return 1;
    } else
    {
        return 0;
    }
}


