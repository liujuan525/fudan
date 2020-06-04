/**
 * 6-24: 设学生人数 N=8，提示用户输入 N 个人的考试成绩，然后计算出平均成绩，显示出来
 */
#include <iostream>
#include <string.h>
using namespace std;

#define N 8

float grades[N]; // 存放成绩的数组

int main()
{
    int i;
    float total, average;
    // 提示输入成绩
    for ( i = 0; i < N; i++)
    {
        cout << "enter grade #" << (i+1) << ":";
        cin >> grades[i];
    }
    total = 0;
    for ( i = 0; i < N; i++)
    {
        total += grades[i];
    }
    average = total / N;
    cout << "\nAverage grade:" << average << endl;

    return 0;
}




