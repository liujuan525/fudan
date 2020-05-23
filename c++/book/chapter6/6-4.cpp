/*
 * @Descripttion: 6-4 题
 * @Author: may
 * @Date: 2020-05-23 17:38:28
 */ 
#include "Point2.h"
#include <iostream>
#include <cmath>
using namespace std;

// 直线线性拟合，points 为个点，nPoint 为点数
float lineFit(const Point2 points[], int nPoint)
{
    float avgX = 0, avgY = 0;
    float lxx = 0, lyy = 0, lxy = 0;
    // 计算 x,y 的平均值
    for (int i = 0; i < nPoint; i++)
    {
        avgX += points[i].getX() / nPoint;
        avgY += points[i].getY() / nPoint;
    }
    for (int i = 0; i < nPoint; i++)
    {
        lxx += (points[i].getX() - avgX) * (points[i].getX() - avgX);
        lyy += (points[i].getY() - avgY) * (points[i].getY() - avgY);
        lxy += (points[i].getX() - avgX) * (points[i].getY() - avgY);
    }
    cout<<"this line can be fitted by y=ax+b."<<endl;
    // 输出回归系数 a
    cout<<"a="<<lxy/lxx<<" ";
    // 输出回归系数 b
    cout<<"b="<<avgY-lxy*avgX/lxx<<endl;
    // 返回相关系数 r
    return static_cast<float>(lxy/sqrt(lxx*lyy));
}

int main()
{
    Point2 p[10] = {Point2(6,10), Point2(14,20), Point2(26,30), Point2(33,40),Point2(46,50), Point2(54,60), Point2(67,70), Point2(75,80), Point2(84,90), Point2(100,100)};
    float r = lineFit(p,10);
    cout<<"line coefficient r="<<r<<endl;

    return 0;
}

