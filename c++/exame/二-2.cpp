/**
 * 程序改错题
 * 程序 2： （请自行确认程序中错误的数量，不超过 3 个）：
 * 错误行号（ 11 ），更正为： void Swap(int& a, int& b)
 * 错误行号（ 13 ），更正为： t = a; a = b; b = t;
 * 错误行号（ ），更正为： 
 */ 
#include <iostream>
using namespace std;

void Swap(int& a, int& b);
int main()
{
    int x(5), y(10);
    cout << "x=" << x << " y=" << y << endl;
    Swap(x, y);
    cout << "x=" << x << " y=" << y << endl;
    return 0;
}

// void Swap(int a, int b)
void Swap(int& a, int& b)
{
    int t;
    t = a; // 新增加
    a = b;
    b = t;
    // t = a; // 此处去除
}






// void Swap(int& a, int& b);
// int main()
// {
//     int x(5), y(10);
//     cout << "X=" << x << " y=" << y << endl;
//     Swap(x, y);
//     cout << "x=" << x << " y" << y << endl;
//     return 0;
// }
// void Swap(int a, int b)
// {
//     int t;
//     a = b;
//     b = t;
//     t = a;
// }