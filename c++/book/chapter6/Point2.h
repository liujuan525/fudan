/*
 * @Descripttion: 6-4 题
 * @Author: may
 * @Date: 2020-05-23 17:38:23
 */ 
#ifndef _POINT_H
#define _POINT_H

class Point2
{
    private:
        float x, y;
    public:
        Point2(float x=0, float y=0) : x(x), y(y) {}
        float getX() const { return x;}
        float getY() const { return y;}
};

#endif