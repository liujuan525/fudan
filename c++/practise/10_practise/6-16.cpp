/*
 * 6-16: 定义一个整型变量 a, 一个整型指针 p,一个引用 r, 通过 p 把 a 的值改为 10， 通过 r 把 a 的值改为 5
 */ 
#include <iostream>
using namespace std;

int main()
{
    int a;
    int *p = &a;
    int &r = a;
    *p = 10;
    cout << "a 的值是：" << a << "\n";
    r = 5;
    cout << "a 的值是：" << a;

    return 0;
}


