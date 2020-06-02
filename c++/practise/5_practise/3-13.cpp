/*
 * @Descripttion: 3-13：用递归的方法编写函数求 Fibonacci 级数，公式为
 * Fn = F(n-1) + F(n-2)(n>2), F1 = F2 = 1
 * 观察递归调用的过程
 * @Author: may
 * @Date: 2020-05-31 19:42:21
 */ 
#include <iostream>
using namespace std;

// 斐波那契函数
int fibonacci(int n)
{
    if (n <= 2)
    {
        return 1;
    } else
    {
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

int main()
{
    int n;
    cout << "请输入一个整数：";
    cin >> n;
    cout << "计算结果为：" << fibonacci(n) << endl;

    return 0;
}
