// 4-1 : 时钟类的完整程序
#include <iostream>
using namespace std;

class Clock
{
    public:
        void setTime(int newH=0, int newM=0, int newS=0);
        void showTime();
    private:
        int hour, minute, second;
};

// 时钟类成员的具体实现
void Clock::setTime(int newH, int newM, int newS) 
{
    hour = newH;
    minute = newM;
    second = newS;
}

inline void Clock::showTime()
{
    cout << hour << ":" << minute << ":" << second << endl;
}

int main()
{
    Clock myClock;
    cout << "first time set and output:" << endl;
    myClock.setTime();
    myClock.showTime();

    cout << "second time set and output:" << endl;
    myClock.setTime(8, 30, 30);
    myClock.showTime();

    return 0;
}

