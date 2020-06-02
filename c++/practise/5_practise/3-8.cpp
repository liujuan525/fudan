/*
 * @Descripttion: 3-8：编写函数把华氏温度转换为摄氏温度，公式为
 * C = 5/9(F-32)
 * 在主程序中提示用户输入一个华氏温度，转化后输出相应的摄氏温度
 * @Author: may
 * @Date: 2020-05-31 19:41:52
 */ 
#include <iostream>
using namespace std;

float centigrade(float c)
{
    float b;
    b = 5.0 / 9.0 * (c - 32);
    return int(b);
}

int main()
{
    float x;
    cout << "请输入一个华氏温度:\n";
    cin >> x;

    cout << "摄氏度：" << centigrade(x) <<endl;

    return 0;
}
