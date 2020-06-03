/*
 * 6-18: 下列程序有何问题，请改正：仔细体会使用指针时应避免出现的这个问题
 */ 
#include <iostream>
using namespace std;

int *fn1();

int main()
{
    int *a = fn1();
    cout << "the value of a is:" << *a;
    delete a;

    return 0;
}

int *fn1()
{
    int *p = new int(5);
    return p;
}

/**
 * 下面为原代码
 */

// int Fn1();
// int main()
// {
//     int a = Fn1();
//     cout << "the value of a is:" << a;
//     return 0;
// }
// int Fn1()
// {
//     int *p = new int (5);
//     return *p;
// }



