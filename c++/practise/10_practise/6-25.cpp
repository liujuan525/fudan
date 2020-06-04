/**
 * 此题有问题
 * 6-25: 设计一个字符串类 MyString, 具有构造函数、析构函数、拷贝构造函数，重载运算符 +、=、+=、[]，尽可能地完善它，使之能满足各种需要。（运算符重载功能为选做，参见第 8 章）
 */ 
#include <iostream>
#include <string.h>
using namespace std;

class MyString
{
    public:
        MyString();
        MyString(const char *const);
        MyString(const MyString &);
        ~MyString();

        char & operator[] (unsigned short offset);
        char operator[] (unsigned short offset) const;
        MyString operator+ (const MyString&);
        void operator+= (const MyString&);
        MyString & operator= (const MyString &);

        unsigned short GetLen()const { return itsLen; }
        const char * GetMyString() const { return itsMyString; }
    private:
        MyString(unsigned short); // private constructor
        char * itsMyString;
        unsigned short itsLen;
};

MyString::MyString()
{
    itsMyString = new char[1];
    itsMyString[0] = '\0';
    itsLen = 0;
}

MyString::MyString(unsigned short len)
{
    itsMyString = new char[len+1];
    for (unsigned short i = 0; i <= len; i++)
    {
        itsMyString[i] = '\0';
        itsLen = len;
    }
}

MyString::MyString(const char * const cMyString)
{
    itsLen = strlen(cMyString);
    itsMyString = new char[itsLen+1];
    for (unsigned short i = 0; i < itsLen; i++)
    {
        itsMyString[i] = cMyString[i];
        itsMyString[itsLen] = '\0';
    }
}     

 MyString::MyString(const MyString & rhs)
 {
     itsLen = rhs.GetLen();
     itsMyString = new char[itsLen+1];
     for (unsigned short i = 0; i < itsLen; i++)
     {
         itsMyString[i] = rhs[i];
         itsMyString[itsLen] = '\0';
     }
 }   

MyString::~MyString()
{
    delete [] itsMyString;
    itsLen = 0;
}

MyString& MyString::operator=(const MyString & rhs)
{
    if (this == &rhs)
    {
        return *this;
        delete [] itsMyString;
        itsLen = rhs.GetLen();
        itsMyString = new char[itsLen+1];
    }
    for (unsigned short i = 0; i < itsLen; i++)
    {
        itsMyString[i] = rhs[i];
        itsMyString[itsLen] = '\0';
        return *this;
    }
}

char & MyString::operator[](unsigned short offset)
{
    if (offset > itsLen)
    {
        return itsMyString[itsLen-1];
    }else
    {
        return itsMyString[offset];
    }
}

char MyString::operator[](unsigned short offset) const
{
    if (offset > itsLen)
    {
        return itsMyString[itsLen-1];
    }else
    {
        return itsMyString[offset];
    }
}

MyString MyString::operator+(const MyString& rhs)
{
    unsigned short totalLen = itsLen + rhs.GetLen();
    MyString temp(totalLen);
    for (unsigned short i = 0; i < itsLen; i++)
    {
        temp[i] = itsMyString[i];

        for (unsigned short j = 0; j < rhs.GetLen(); j++)
        {
            temp[i] = rhs[j];
            temp[totalLen] = '\0';
            return temp;
        }
    }
} 

void MyString::operator+=(const MyString& rhs)
{
    unsigned short rhsLen = rhs.GetLen();
    unsigned short totalLen = itsLen + rhsLen;
    MyString temp(totalLen);
    for (unsigned short i = 0; i < itsLen; i++)
    {
        temp[i] = itsMyString[i];
        for (unsigned short j = 0; j < rhs.GetLen(); j++)
        {
            temp[i] = rhs[i-itsLen];
            temp[totalLen] = '\0';
            *this = temp;
        }
    }
}

int main()
{
    MyString s1("initial test");
    cout << "s1:\t" << s1.GetMyString() << endl;

    char * temp = "hello world";
    s1 = temp;
    cout << "s1:\t" << s1.GetMyString() << endl;

    char tempTwo[20];
    strcpy(tempTwo, ":nice to be here!");
    s1 += tempTwo;
    cout << "tempTwo:\t" << tempTwo << endl;
    cout << "s1:\t" << s1.GetMyString() << endl;

    cout << "s1[4]:\t" << s1[4] << endl;
    s1[4] = 'x';
    cout << "s1:\t" << s1.GetMyString() << endl;

    cout << "s1[999]:\t" << s1[999] << endl;

    MyString s2("another myString");
    MyString s3;
    s3 = s1 + s2;
    cout << "s3:\t" << s3.GetMyString() << endl;

    MyString s4;
    s4 = "why does this work?";
    cout << "s4:\t" << s4.GetMyString() << endl;

    return 0;
}












