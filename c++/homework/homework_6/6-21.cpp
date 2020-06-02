/**
 * 6-21: 编写一个函数，统计一条英文句子中字母的个数，在主程序中实现输入输出。
 * */
#include <iostream>
#include <string>
using namespace std;

int count(string &str)
{
    int num = 0;
    for (int i = 0; str[i]; i++)
    {
        if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z'))
        {
            num++;
        }
    }
    return num;    
}

int main()
{
    string text;
    cout << "输入一个英语句子：" << endl;
    // getline ： 从键盘读入字符串，直到行末为止，不以中间的空格作为输入的分隔符
    getline(cin, text);
    cout << "这个句子里有 " << count(text) << " 个 字母。" << endl;

    return 0;
}