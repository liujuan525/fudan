/*
 * @Descripttion: 类的实现
 * @Author: may
 * @Date: 2020-05-17 21:55:41
 */
#include "point.h"
#include <iostream>
using namespace std;

int point::count = 0;

point::point(const point &p) : x(p.x), y(p.y)
{
    count++;
}

void point::showCount()
{
    cout<<" object count="<<count<<endl;
}