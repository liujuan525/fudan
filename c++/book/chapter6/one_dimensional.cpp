/*
 * @Descripttion: 一维数组举例
 * 循环从键盘读入若干组选择题答案，计算并输出每组答案的正确率，直到输入 ctrl+z 为止
 * 每组连续输入 5 个答案，每个答案可以是 a ...d
 * @Author: may
 * @Date: 2020-05-23 12:05:41
 */ 
#include <iostream>
using namespace std;
int main()
{
    char key[] = {'a', 'c', 'b', 'a', 'd'}; // 正确答案数组
    char c; // 保存输入的数据
    int ques = 0; // 当前计算的题
    int numques = 5; // 当前已经计算到第几题
    int numcorrect = 0; // 当前计算正确数量
    cout<<"Enter the "<<numques<<" question tests:"<<endl;
    while (cin.get(c))
    {
        if (c == 'z') // 程序结束
        {
            return 0;
        }
        if (c != '\n') { // 输入的值是否等于回车
            if (c == key[ques])
            {
                numcorrect++;
                cout<<" ";
            } else
            {
                cout<<"x";
            }
        } else
        {
            cout<<" score "<<float(numcorrect)/numques * 100<<"%";
            // reset variables
            ques = 0;
            numcorrect = 0;
            cout<<endl;
            continue;
        }
        ques++;
    }
    return 0;
}