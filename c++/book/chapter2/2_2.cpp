#include <iostream>

using namespace std;

// 输入一个年份，判断是否是闰年
// 闰年的计算方法：可以被4整除而不能被100整除，或者能被400整除
int main() {
    int year;
    bool isLeapYear;
    cout<<"enter the year:";
    // cin>>year;
    year = 2000;
    
    isLeapYear = (year%4 == 0 && year % 100 != 0) || (year % 400 == 0);

    if (isLeapYear) {
        cout<<year<<" is a leap year;"<<endl;
    } else {
        cout<<year<<" is not a leap year;"<<endl;
    }
}