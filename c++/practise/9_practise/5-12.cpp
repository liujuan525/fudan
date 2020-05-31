/*
 * @Descripttion: 在函数 fn1() 中定义一个静态变量 n, fn1() 中对 n 的值加 1，在主函数中，调用 fn1
 * () 十次，显示 n 的值
 * @Author: may
 * @Date: 2020-05-24 17:57:20
 */ 
#include <iostream>
using namespace std;

void fn1()
{
    static int n = 0;
    n++;
    cout<<"n 的值为 "<<n<<endl;
}

int main()
{
    for (int i = 0; i < 10; i++)
    {
        fn1();
    }
    
    return 0;
}