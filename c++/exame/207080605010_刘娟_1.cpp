/**
 * 三 1、输入两个整数 n 和 x，求从 1 到 n（n ≤ 10000）的所有整数中，数字 x（0 ≤ x ≤ 9）出现的次数。 （例如：输入 30,2，输出 13）
 */ 
#include <iostream>
using namespace std;

void calculateNum(int x, int n);
int count = 0, n, x;

int main()
{
    cout << "Please enter an integer x from 0-9:";
    cin >> x;
    if (x < 0 || x > 9)
    {
        cout << "Integer x is wrong！" << endl;
        exit(0);
    }
    
    cout << "Please enter an integer n from 1-10000:";
    cin >> n;
    if (n < 1 || n > 10000)
    {
        cout << "Integer n is wrong！" << endl;
        exit(0);
    }

    /** 分别扫描 1 到 n 的所有数字 */
    for (int i = 0; i <= n; i++)
    {
        calculateNum(x, i);
    }
    cout << count << endl;
}

void calculateNum(int x, int n)
{
    int temp;
    while (n != 0)
    {
        temp = n % 10; // 取出每一位
        // cout << n << "-" << temp << endl;
        /** 判断值是否相匹配 */
        if (temp == x)
        {
            count++;
        }
        n /= 10; // 进位
    }
}

