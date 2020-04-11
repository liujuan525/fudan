// 编写一个完整的程序，运行时向用户提问“你考试考了多少分？(0-100）”，接收输入后判断其等级显示出来，规则如下：
// 优：90<=分数<=100 良：80<=分数<90 中：60<=分数<80 差：0<=分数<60  
#include <iostream>
using namespace std;

int main()
{
    int score;
    cout<<"你考试考了多少分？";
    cin>>score;
    if (score >= 90 && score <= 100) 
    {
        cout<<"你的成绩为："<<score<<"分,等级为：优";
    }
    else if (score >= 80 && score < 90)
    {
        cout<<"你的成绩为："<<score<<"分,等级为：良";
    }
    else if (score >= 60 && score < 80)
    {
        cout<<"你的成绩为："<<score<<"分,等级为：中";
    }
    else if (score >= 0 && score < 60)
    {
        cout<<"你的成绩为："<<score<<"分,等级为：差";
    }
    else
    {
        cout<<"你输入的成绩不在正确的数值范围之内.";
    }
    cout<<endl;

    return 0;
}