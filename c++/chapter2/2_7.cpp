#include <iostream>
using namespace std;

// 用 do...while 语句编程，求自然数 1-10 之和
int main() {
    int i = 1;
    int sum = 0;
    do
    {
        sum += i;
        i++;
    } while (i <= 10);
    cout<<"相加之和为："<<sum<<endl;
    
    return 0;
}