/*
 * @Descripttion: 3-12: 在主程序中提示输入整数 n，编写函数用递归的方法求 1+2+...+n 的值
 * @Author: may
 * @Date: 2020-05-31 19:42:12
 */ 
#include <iostream>
using namespace std;

// 递归计算
int calculate(int n)
{
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        sum += i;
    }
    return sum;
}

int main()
{
    int n;
    cout << "请输入一个整数：" ;
    cin >> n;
    cout << "递归结果为：" << calculate(n) << endl;

    return 0;
}
