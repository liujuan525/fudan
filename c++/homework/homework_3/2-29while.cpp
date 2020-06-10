/**
 * 2-29:用穷举法找出 1-100 间的质数并显示出来。分别使用 while, do...while, for 循环语句实现
 **/
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int j, k, flag;
    int i = 2;
    int num = 0;
    while (i <= 100)
    {
        flag = 1;
        k = sqrt(i);
        j = 2;
        while (j <= k)
        {
            if (i % j == 0)
            {
                flag = 0;
                break;
            }
            j++;
        }
        if (flag)
        {
            cout << i << " is prime number.\n" << endl;
            num++;
        }
        i++;
    }
    cout << "There are " << num << " prime numbers." << endl;

    return 0;
}

