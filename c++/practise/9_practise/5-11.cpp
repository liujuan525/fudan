/*
 * @Descripttion: 5-11: 在一个文件中定义一个全局变量 n，主函数 main()，在另一个文件中定义函数 fn1()，在 main() 中对 n 赋值，再调用 fn1(), 在 fn1() 中也对 n 赋值，显示 n 最后的值
 * @Author: may
 * @Date: 2020-05-24 18:06:20
 */ 
#include <iostream>
#include "fn1.h"
using namespace std;

int n;
int main()
{
    n = 20;
    fn1();
    cout<<"n 的值为 "<<n<<endl;
    return 0;
}