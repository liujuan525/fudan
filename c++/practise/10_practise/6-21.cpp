/*
 * 6-21: 编写一个函数，统计一个英文句子中字母的个数，在主程序中实现输入、输出 
 */ 
#include <iostream>
#include <string>
using namespace std;

int count(char * str)
{
    int num = 0;
    for (int i = 0; str[i]; i++)
    {
        char fun = str[i];
        if ((fun >= 'a' && fun <= 'z') || (fun >= 'A' && fun <= 'Z'))
        {
            num++;
        }
    }
    return num;
}

int main()
{
    char text[100];
    cout << "输入一个英语句子：" << endl;
    gets(text);
    cout << "这个句子里有" << count(text) << "个字母。" << endl;

    return 0;
}



