/*
 * @Descripttion: 第五章 5-3 题
 * 下面程序的运行结果是什么？实际运行一下，看看与你的设想有何不同
 * @Author: may
 * @Date: 2020-05-24 17:49:32
 */ 
#include <iostream>
using namespace std;

int x=5, y=7;

void myFunction()
{
    int y=10;
    cout<<"x from myFunction:"<<x<<"\n";
    cout<<"y from myFunction:"<<y<<"\n";
}

int main()
{
    cout<<"x from main:"<<x<<"\n";
    cout<<"y from main:"<<y<<"\n\n";
    myFunction();
    cout<<"back from myFunction!\n\n";
    cout<<"x from main:"<<x<<"\n";
    cout<<"y from main:"<<y<<"\n";

    return 0;
}

