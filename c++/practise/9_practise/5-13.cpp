/*
 * @Descripttion: 5-13: 定义类 X,Y,Z,函数 h(X *)，满足：类 X 有私有成员 i,Y 的成员函数 g(X *) 是 X 的友元函数，实现对 X 的成员 i 加 1，类 Z 是类 X 的友元类，其成员函数 f(X *)实现对 X 的成员 i 加 5，函数 h(X *) 是 X 的友元函数，实现对 X 的成员 i 加 10，在一个文件中定义和实现类，在另一个文件中实现 main() 函数
 * @Author: may
 * @Date: 2020-05-31 18:07:26
 */ 
#include <iostream>
#include "my_x_y_z.h"

int main()
{
    X x;
    Z z;
    z.f(&x);
    return 0;
}