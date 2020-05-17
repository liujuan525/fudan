/*
 * @Descripttion: 常成员函数举例
 * @Author: may
 * @Date: 2020-05-17 21:15:24
 */
#include <iostream>
using namespace std;

class R
{
    public:
        R(int r1, int r2) : r1(r1), r2(r2){}
        void print();
        void print() const;
    private:
        int r1, r2;
};

void R::print()
{
    cout<<r1<<":"<<r2<<endl;
}

void R::print() const
{
    cout<<r1<<":"<<r2<<endl;
}

int main()
{
    R a(5,4);
    a.print();
    const R b(20,52);
    b.print();
    
    return 0;
}



