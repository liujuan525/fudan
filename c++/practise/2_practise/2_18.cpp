/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
// 2-18：输出 ASCII 码为 32-126 的字符

#include <iostream>
using namespace std;

// char 型从本质上来说也是整数类型，它是长度为1个字节的整数，通常用来存放字符的 ASCII 码
int main()
{
    char c;
    int i;
    for (c = 32; c <= 126; c++)
    {
        i = c;
        cout<<c<<" 的ASCII 码为："<<i<<"\n";
    }
    cout<<endl;
    return 0;
}
