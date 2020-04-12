/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
// 2-33:声明枚举类型 Weekday,包括 SUNDAY 到 SATURDAY 七个元素在程序中声明 Weekday 类型的变量，对其赋值，声明整型变量，看看能否对其赋 Weekday 类型的值
#include <iostream>
using namespace std;

enum Weekday {SUNDAY=7, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
int tamp;
int main()
{
    tamp = FRIDAY;
    cout<<"变量赋值的结果为:"<<tamp;
    cout<<endl;

    return 0;
}