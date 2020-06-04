/*
 * 6-22: 编写函数 int index(char *s, char *t), 返回字符串 t 在字符串 s 中出现的最左边的位置，如果在 s 中没有与 t 匹配的子串，就返回 -1
 */ 
#include <iostream>
#include <string>
using namespace std;

int index(char *p, char *q)
{
    char *a;
    char *b;
    int num = 1; // 用来记载位置数
    while (*p != '\0') // 对 p 字符串逐一进行判别
    {
        // 用 a,b 分别替换 p和q
        a = p;
        b = q;
        while (*b != '\0' && *a != '\0' && *b == *a)
        {
            a++;
            b++;
        }

        if (*b == '\0')
        {
            return num;
        }
        num++;
        p++;
    }
    return -1;
}

int main()
{
    while (1)
    {
        char *s = new char[100];
        char *t = new char[50];
        cout << "请输入字符串s：" << endl;
        gets(s); // 将获取到的字符串存入字符指针中
        cout << "请输入字符串t：" << endl;
        gets(t); // 将获取到的字符串存入字符指针中
        int n = index(s,t);
        if(n == -1)
            cout<<t<<"不在"<<s<<"中！"<<endl;
        else
            cout<<t<<"在"<<s<<"中左起第"<<n<<"个位置！"<<endl;
            exit(0);
    }

    return 0;
}



// int index(char *s, char *t)
// {
//     int i, j, k;
//     for ( i = 0; s[i] != '\0'; i++)
//     {
//         for ( j = i,k = 0 ; t[k] != '\0' && s[j] == t[k]; j++, k++)
//         {
//             if (t[k] == '\0')
//             {
//                 return i;
//             }
//         }
//     }
// }





