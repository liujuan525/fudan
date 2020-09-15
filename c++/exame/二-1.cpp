/**
 * 程序改错题
 * 程序 1（请自行确认程序中错误的数量，不超过 3 个）：
 * 错误行号（ 3 ），更正为： int main()
 * 错误行号（ 8 ），更正为： cout << "a、b的平方和：" << fun1(a, b) << endl;
 * 错误行号（ 13 ），更正为： return (fun2(x) + fun2(y));
 * 已做完
 */ 
#include <iostream>
using namespace std;

// void main(void)
int main()
{
    int a, b;
    int fun1(int x, int y);
    cin >> a >> b;
    cout << "a、b的平方和：" << fun1(a, b) << endl;
//     cout << "a、b的平方和：" << fun1(x, y) << endl;
}

int fun1(int x, int y)
{
    int fun2(int m);
    return (fun2(x) + fun2(y));
//     return (fun1(x) + fun1(y));
}

int fun2(int m)
{
    return (m * m);
}

