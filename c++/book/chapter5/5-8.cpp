/*
 * @Descripttion: 常数据成员举例
 * @Author: may
 * @Date: 2020-05-17 21:15:30
 */
#include <iostream>
using namespace std;

class A
{
    public:
        A(int i);
        void print();
    private:
        const int a ;
        static const int b;
};
// 静态成员在类外说明和初始化
const int A::b = 10;
// 常数据成员只能通过初始化列表来获得初值
A::A(int i) : a(i){};

void A::print()
{
    cout<<a<<":"<<b<<endl;
}

int main()
{
    A a1(100), a2(0);
    a1.print();
    a2.print();

    return 0;
}

