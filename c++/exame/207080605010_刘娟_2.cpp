/**
 * 三 2、定义 string 类，实现字符串加法运算： str1=”abc”, str2=”1234” str1+str2=”a1b2c34”
 */ 
#include <iostream>
#include <string.h>
using namespace std;

class String
{
private:
    /* data */
public:
    String(/* args */);
    ~String();
    void addition(char &a, char &b){};
};

String::String(/* args */)
{
}

void addition(char *str1, char *str2)
{
    int len1 = strlen(str1);
    int len2 = strlen(str2);
    string strResult;

    if (len1 > len2)
    {
        for (int i = 0; i <= len1; i++)
        {
            strResult.push_back(str1[i]);
            if (i < len2)
            {
                strResult.push_back(str2[i]);
            }
        }
    } else
    {
        for (int i = 0; i <= len2; i++)
        {
            if (i < len1) {
                strResult.push_back(str1[i]);
            }
            strResult.push_back(str2[i]);
        }
    }

    cout << "str1+str2=" << strResult << endl;
}

int main()
{
    char str1[]="abc";
    char str2[]="1234";
    addition(str1, str2);

    return 0;
}







