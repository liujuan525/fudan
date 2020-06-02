/**
 * 2-29:用穷举法找出 1-100 间的质数并显示出来。分别使用 while, do...while, for 循环语句实现
 * 此题有问题，少了一个质数 2 ，待优化
 **/
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int j, k, flag;
    int i = 2;
    int num = 0;
    do
    {
        flag = 1;
        k = sqrt(i);
        j = 2;
        do
        {
            if (i % j == 0)
            {
                flag = 0;
                break;
            }
            j++;
        } while (j <= k);

        if (flag)
        {
            cout << i << "是质数.\n" << endl;
            num += 1;
        }
        i++;
    } while (i <= 100);
    
    cout << "共" << num << "个质数." << endl;

    return 0;
}





