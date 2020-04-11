#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int i = 1;

    // cout<<i++ <<endl;

    // cout <<++i <<endl;

    // 设置域宽为5个字符，小数点后保留两位有效数字
    // cout<<setw(5)<<setprecision(3)<<3.1415<<endl;

    int x,y;
    x = 5;

    if (x < 0) {
        y=-1;
        cout<<y <<endl;
    } else if (x == 0) {
        y = 0;
        cout<<y <<endl;
    } else {
        y = 1;
        cout<<y <<endl;
    }




}