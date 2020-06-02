// 第三次作业
// 用穷举法找出 1-100 间的质数并显示出来。分别使用 while, do...while, for 循环语句实现
// 质数：一个大于 1 的自然数，除了 1 和 它自身之外不能被其它自然数整除的数
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int N = 0;
    int i, j, k;
    for (i = 2; i <= 100; i++)
    {
        int flag = 1;
        k = sqrt(i);
        for (j = 2; j <= k; j++)
        {
            if (i % j == 0) 
            {
                flag = 0;
                break;
            }
        }
        if (flag)
        {
            cout << i << "是质数.\n";
            N += 1;
        }
    }
    cout << "共有: " << N << " 个质数。" << endl;

    return 0;
}