/*
 * @Descripttion: 具有静态和动态生存期对象的时钟程序
 * @Author: may
 * @Date: 2020-05-16 21:26:07
 */
#include <iostream>
using namespace std;

class Clock //时钟类定义
{
    public: // 外部接口
        Clock();
        void setTime(int newH, int newM, int newS); // 3个形参具有函数原型作用域
        void showTime();
    private: // 私有数据成员
        int hour, minute, second;
};

// 时钟类成员函数实现
Clock::Clock():hour(0), minute(0), second(0){} // 构造函数

void Clock::setTime(int newH, int newM, int newS) // 三个形参均具有局部作用域
{
    hour = newH;
    minute = newM;
    second = newS;
}

void Clock::showTime()
{
    cout<<hour<<":"<<minute<<":"<<second<<endl;
}

Clock globClock; // 声明对象 globClock,具有静态生存期，命名空间作用域

int main()
{
    cout<<"first time output:"<<endl;
    // 引用具有命名空间作用域的对象 globClock
    globClock.showTime(); // 对象的成员函数具有类作用域
    globClock.setTime(8, 30, 30);

    Clock myClock(globClock);
    // 调用复制构造函数，以 globClock 为初始值
    cout<<"second time output:"<<endl;
    myClock.showTime();

    return 0;
}

