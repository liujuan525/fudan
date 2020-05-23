/*
 * @Descripttion: 6-3 题
 * @Author: may
 * @Date: 2020-05-23 15:50:51
 */ 
#ifndef _POINT_H
#define _POINT_H

class Point
{
private: // 私有数据成员
    int x, y;
public: // 外部接口
    Point();
    Point(int x, int y);
    ~Point();
    void move(int newX, int newY);
    int getX() const { return x;}
    int getY() const { return y;}
    static void showCount(); // 静态函数成员
};

#endif