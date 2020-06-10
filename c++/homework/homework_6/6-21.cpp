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
    cout << "Please enter an English sentence:" << endl;
    getline(cin, text);
    cout << "There are " << count(text) << " letters." << endl;

    return 0;
}