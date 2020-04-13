#include <iostream>
using namespace std;

// 求自然数 1-10 之和
int main() {

    int i=1;
    int sumResult=0;
    while (i <= 10)
    {
        sumResult += i;
        i++;
    }
    
    cout<<"相加之和为:"<<sumResult<<endl;

    return 0;
}