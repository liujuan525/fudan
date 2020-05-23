/*
 * @Descripttion: 6-3 题
 * @Author: may
 * @Date: 2020-05-23 15:50:59
 */ 
#include <iostream>
#include "Point.h"
using namespace std;

Point::Point()
{
    x = y = 0;
    cout<<"Default constructor called."<<endl;
}

Point::Point(int x, int y) : x(x), y(y)
{
    cout<<"constructor called."<<endl;
}

Point::~Point()
{
    cout<<"Destructor called."<<endl;
}

void Point::move(int newX, int newY)
{
    cout<<"moving the point to ("<<newX<<", "<<newY<<")"<<endl;
    x = newX;
    y = newY;
}
