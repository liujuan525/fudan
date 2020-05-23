/* 
 * @Descripttion:具有静态数据成员的 Point 类 
 * @Author: may
 * @Date: 2020-05-16 21:26:12
 */
#include <iostream>
using namespace std;

class Point
{
    public:
        Point(int x, int y): x(x), y(y) 
        {
            count++;
        }
        Point(Point &p)
        {
            x = p.x;
            y = p.y;
            count++;
        }
        ~Point(){ count--;}
        int getX(){ return x;}
        int getY(){ return y;}

        void showCount()
        {
            cout<<" object count="<<count<<endl;
        }
    private:
        int x, y;
        static int count;
};

int Point::count = 0;

int main()
{
    Point a(4, 5);
    cout<<"Point A:"<<a.getX()<<", "<<a.getY();
    a.showCount();

    Point b(a);
    cout<<"Point B:"<<b.getX()<<", "<<b.getY();
    b.showCount();

    return 0;
}