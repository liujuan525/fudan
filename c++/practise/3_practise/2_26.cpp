// 编写一个完整的程序，实现功能：向用户提问“现在正在下雨吗？”，提示用户输入 Y 或 N。若输入为 Y，显示“现在正在下雨。”；若输入为 N，显示“现在没有下雨。”；否则继续提问“现在正在下雨吗？”。
#include <iostream>
using namespace std;

int main()
{
    string result;
    Judge:cout<<"现在正在下雨吗？\n"<<"请输入Y或者N:";
    cin>>result;
    if (result == "Y")
    {
        cout<<"现在正在下雨。";
    } 
    else if (result == "N")
    {
        cout<<"现在没有下雨。";
    }
    else 
    {
        // goto 语句：使程序的执行流程跳转到语句标号所指定的语句
        goto Judge;
    }
    cout<<endl;
    return 0;
}