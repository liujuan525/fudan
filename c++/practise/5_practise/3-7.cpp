/*
 * @Descripttion: 3-7：完成函数，参数为两个 unsigned short int 型数，返回值为第一个参数除以第二个参数的结果，数据类型为 short int;如果第二个参数为 0，则返回值为 -1，在主程序中实现输入输出
 * @Author: may
 * @Date: 2020-05-31 19:41:46
 */ 
#include <iostream>
using namespace std;

short int Divider(unsigned short int a, unsigned short int b)
{
    if (b == 0)
    {
        return -1;
    } else
    {
        return a/b;
    }
}
typedef unsigned short int USHORT;
typedef unsigned long int LONG;
int main()
{
    USHORT one, two;
    short int answer;
    cout<<"enter two number.\n number one:";
    cin>>one;
    cout<<"number two:";
    cin>>two;
    answer = Divider(one, two);
    if (answer > -1)
    {
        cout<<"answer: "<<answer;
    } else
    {
        cout<<"error, can't divide by zero!";
    }

    return 0;
}


