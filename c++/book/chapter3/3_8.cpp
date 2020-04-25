/*
 * @Descripttion: 求 n!，公式如下： n! = 1(n=0), n! = n(n-1)!(n>0)
 * @Author: may
 * @Date: 2020-04-23 21:34:44
 */
#include <iostream>
using namespace std;

unsigned fac(unsigned n) {
    unsigned f;
    if (n == 0) {
        f = 1;
    } else {
        f = fac(n-1) * n;
    }
    return f;
}

int main() {
    unsigned n;
    cout<<"Enter a positive integer:";
    cin>>n;
    unsigned y = fac(n);
    cout<<n<<"!="<<y<<endl;
    return 0;
}


