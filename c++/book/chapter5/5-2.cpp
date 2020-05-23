/*
 * @Descripttion: 变量的生存期与可见性
 * @Author: may
 * @Date: 2020-05-16 21:26:03
 */
#include <iostream>
using namespace std;

int i = 1;

void other()
{
    static int a = 2;
    static int b;
    int c = 10;
    a += 2;
    i += 32;
    c += 5;
    cout<<"--other--"<<endl;
    cout<<"i:"<<i<<" a:"<<a<<" b:"<<b<<" c:"<<c<<endl;
    b = a;
}

int main()
{
    static int a;
    int b = -10;
    int c = 0;
    cout<<"--main--"<<endl;
    cout<<"i:"<<i<<" a:"<<a<<" b:"<<b<<" c:"<<c<<endl;
    c += 8;
    other();
    cout<<"i:"<<i<<" a:"<<a<<" b:"<<b<<" c:"<<c<<endl;
    i += 10;
    other();

    return 0;
}