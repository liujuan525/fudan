/*
 * @Descripttion: 作用域实例
 * @Author: may
 * @Date: 2020-05-16 21:26:03
 */
#include <iostream>
using namespace std;

int i;
namespace Ns {
    int j;
}

int main()
{
    i = 5;
    Ns::j = 6;
    {
        using namespace Ns;
        int i;
        i = 7;
        cout<<"i="<<i<<endl;
        cout<<"j="<<j<<endl;
    }
    cout<<"i="<<i<<endl;
    
    return 0;
}