// 用穷举法找出 1-100 间的质数并显示出来。分别使用 while,do...while,for循环语句实现
#include <iostream>
using namespace std;

// 质数：一个大于 1 的自然数，除了 1 和 它自身之外不能被其它自然数整除的数
int main()
{
    int N = 0;
    for (int i = 2; i < 100; i++)
    {
        bool flag = true;
        for (int j = 2; j < i; j++)
        {
            if (i % j == 0) 
            {
                flag = false;
                break;
            }
        }
        if (flag == true)
        {
            cout<<i<<"\n";
            N += 1;
        }
    }
    cout<<"共有: "<<N<<" 个质数。"<<endl;

    return 0;
}