// 运行下面的程序，观察其输出，体会 i++ 与 ++i 的差别
#include <iostream>
using namespace std;

int main() 
{
    int myAge  = 39;
    int yourAge = 39;
    cout<<"I am:"<<myAge<<" years old."<<endl; // 39
    cout<<"You are:"<<yourAge<<" years old."<<endl; // 39
    myAge++; // 39
    ++yourAge; // 40
    cout<<"One year passes..."<<endl;
    cout<<"I am:"<<myAge<<" years old."<<endl; // 40
    cout<<"You are:"<<yourAge<<" years old."<<endl; // 40
    cout<<"Another years passes."<<endl;
    cout<<"I am:"<<myAge++<<" years old."<<endl; // 40
    cout<<"You are:"<<++yourAge<<" years old."<<endl; // 41
    cout<<"Let's print it again."<<endl;
    cout<<"I am:"<<myAge<<" years old."<<endl; // 41
    cout<<"Your are:"<<yourAge<<" years old."<<endl; // 41

    return 0;
}






