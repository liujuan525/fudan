#include <iostream>
using namespace std;

// 输入一个整数，求出它的所有因子
int main() {
    int n = 36;
    cout<<"Number "<<n<<" Factors:";
    for (int k = 1; k <= n; k++)
    {
        if (n % k == 0) {
            cout<<k<<" ";
        }
        cout<<endl;
    }

    return 0;
}