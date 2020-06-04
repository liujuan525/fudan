/*
 * 6-28: 定义一个 Employee 类，其中包括表示姓名、街道地址、城市和邮编等属性，包括 change_name() 和 display() 等函数；display() 使用 cout 语句显示姓名、街道地址、城市和邮编等属性，函数 change_name() 改变对象的姓名属性，实现并测试这个类
 */ 
#include <iostream>
#include <string.h>
using namespace std;

class Employee
{
    public:
        Employee(char *n, char *str, char *ct, char *z);
        void change_name(char *n);
        void display();
    private:  
        char name[30];
        char street[30];
        char city[18];
        char zip[6];  
};

Employee::Employee(char *n, char *str, char *ct, char *z)
{
    strcpy(name, n);
    strcpy(street, str);
    strcpy(city, ct);
    strcpy(zip, z);
}

void Employee::change_name(char *n)
{
    strcpy(name, n);
}

void Employee::display()
{
    cout << name << " " << street << " ";
    cout << city << " " << zip;
}

int main()
{
    Employee el("张三", "平安大街3号", "北京", "100000");
    el.display();
    cout << endl;
    el.change_name("李四");
    el.display();
    cout << endl;

    return 0;
}






