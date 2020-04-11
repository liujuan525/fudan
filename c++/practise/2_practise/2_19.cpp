// 2-19：运行下面的程序，观察其输出，与你的设想是否相同？
#include <iostream>
using namespace std;

int main()
{
    unsigned int x;
    unsigned int y = 100;
    unsigned int z = 50;
    x = y = z;
    cout<<"Difference is:"<<x<<endl;
    x = z = y;
    cout<<"\n Now difference is:"<<x<<endl;

    return 0;
}