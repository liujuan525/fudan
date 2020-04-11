#include <iostream>
using namespace std;

int main()
{
    int N = 0; // 统计总数
    int i = 2;
    while (i < 100)
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
        i++;
    }
    cout<<"共有: "<<N<<" 个质数。"<<endl;

    return 0;
}