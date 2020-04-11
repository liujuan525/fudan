/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
// 2-14：已知 x, y 两个变量，写一条简单的 if 语句，把较小的值赋给原本值较大的变量
#include <iostream>
using namespace std;

int main()
{
    int a = 50, b = 100;
    int tamp;
    if (a > b){
        tamp = a;
        a = b;
        b = tamp;
        cout<<"a 的值为："<<a<<"\n";
        cout<<"b 的值为："<<b<<"\n";
    } else {
        tamp = b;
        b = a;
        a = tamp;
        cout<<"a 的值为："<<a<<"\n";
        cout<<"b 的值为："<<b<<"\n";
    }
    cout<<endl;
    
    return 0;
}