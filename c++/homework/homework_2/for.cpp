// 用 for 实现 1000 以内自然数，所有7的倍数的和
#include <iostream>
using namespace std;

int main()
{
    int sumResult = 0;   

    for (int i = 0; i < 1000; i++)
    {
        if (i % 7 == 0)
        {
            sumResult += i;
        }
    }
    cout<<"1000 以内自然数，7的倍数的和为："<<sumResult<<endl;

    return 0;
}