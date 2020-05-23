/*
 * @Descripttion: 指针的定义、赋值与使用
 * @Author: may
 * @Date: 2020-05-23 18:20:44
 */ 
#include <iostream>
using namespace std;

int main()
{
    int i;
    // 取 i 的地址赋给 ptr
    int *ptr = &i;
    i = 10;
    cout<<"i="<<i<<endl;
    // 输出 int 型指针所指地址的内容
    cout<<"*ptr="<<*ptr<<endl;

    return 0;
}


