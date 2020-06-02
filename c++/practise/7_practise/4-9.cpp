/*
 * @Descripttion: 设计并测试一个名为 Rectangle 的矩形类，其属性为矩形的左下角与右上角两个点的坐标，根据坐标能计算矩形的面积
 * @Author: may
 * @Date: 2020-05-24 18:36:30
 */ 
#include <iostream>
using namespace std;

class Rectangle
{
    public:
        Rectangle (int top, int left, int bottom, int right);
        ~Rectangle () {}
        int GetTop() const { return itsTop; }
        int GetLeft() const { return itsLeft; }
        int GetBottom() const { return itsBottom; }
        int GetRight() const { return itsRight; }
        void SetTop(int top) { itsTop = top; }
        void SetLeft (int left) { itsLeft = left; }
        void SetBottom (int bottom) { itsBottom = bottom; }
        void SetRight (int right) { itsRight = right; }
        int GetArea() const;
    private:
        int itsTop;
        int itsLeft;
        int itsBottom;
        int itsRight;
};

Rectangle::Rectangle(int top, int left, int bottom, int right)
{
    itsTop = top;
    itsLeft = left;
    itsBottom = bottom;
    itsRight = right;
}

int Rectangle::GetArea() const
{
    int Width = itsRight-itsLeft;
    int Height = itsTop - itsBottom;
    return (Width * Height);
}

int main()
{
    Rectangle MyRectangle (100, 20, 50, 80 );
    int Area = MyRectangle.GetArea();
    cout << "Area: " << Area << "\n";

    return 0;
}


