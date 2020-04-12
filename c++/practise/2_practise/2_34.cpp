/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
//2_34:口袋中有红、黄、蓝、白、黑 5种颜色的球若干个，每次从口袋中取出3个不同颜色的球，问有多少种取法？
#include <iostream>
using namespace std;

enum Color {red, yellow, blue, white, black};
// 声明转换函数
void transfer(int value);

int main()
{
    int n = 0;

    for (int i = red; i <= black; i++)
    {
        for (int j = red; j <= black; j++)
        {
            for (int k = red; k <= black; k++)
            {
                if (i != j && k != i && k != j)
                {
                    n = n + 1;
                    transfer(i);
                    cout<<" ";
                    transfer(j);
                    cout<<" ";
                    transfer(k);
                    cout<<"\n";
                }
            }
        }
    }
    cout<<"共有"<<n<<"种取法!";
    cout<<endl;
    return 0;
}

/**
 * 数据转换函数
*/ 
void transfer(int value)
{
    switch (value)
    {
    case 0:
        cout<<"red";
        break;
    case 1:
        cout<<"yellow";
        break;
    case 2:
        cout<<"blue";
        break; 
    case 3:
        cout<<"white";
        break;   
    case 4:
        cout<<"black";
        break;        
    default:
        break;
    }
}