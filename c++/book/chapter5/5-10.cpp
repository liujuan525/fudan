/*
 * @Descripttion: 主函数
 * @Author: may
 * @Date: 2020-05-17 21:15:47
 */
#include "point.cpp"
// 上面的引用，课本为 #include "point.h" ，但是编译报错
#include <iostream>
using namespace std;

int main()
{
    point a(4, 5);
    cout<<"point A: "<<a.getX()<<", "<<a.getY();
    point::showCount();

    point b(a);
    cout<<"point B:"<<b.getX()<<", "<<b.getY();
    point::showCount();

    return 0;
}
