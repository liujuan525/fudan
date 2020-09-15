// #include <string>
#include <string.h>
#include <iostream>

using namespace std;

int main() 
{
    char *str1 = "abc";
    char *str2 = "1234";
    int len1 = strlen(str1);
    int len2  = strlen(str2);
    string resu;

    if (len1 > len2)
    {
        for (int i = 0; i <= len1; i++)
        {
            resu.push_back(str1[i]);
            resu.push_back(str2[i]);
        }
        
    } else {
        for (int i = 0; i <= len2; i++)
        {
            resu.push_back(str1[i]);
            resu.push_back(str2[i]);
        }
    }
    
    cout << resu << endl;

    return 0;
}