/**
 * 2-28: （2）实现一个简单的菜单程序，运行时显示"Menu: A(dd) D(elete) S(ort) Q(uit)， Select one:"提示用户输入，A表示增加，D表示删除，S表示排序，Q表示退出，输入为A、D、S时分别提示"数据已经增加、删除、排序。"输入为Q时程序结束。要求使用Switch语句。
 */ 
#include <iostream>
using namespace std;

int main()
{
    char choice;
    while (1)
    {
        cout << "Menu: A(dd) D(elete) S(ort) Q(uit)， Select one:";
        cin >> choice;
        switch (toupper(choice))
        {
            case 'A':
                cout << "数据已经增加. " << endl;
                break;
            case 'D':
                cout << "数据已经删除. " << endl;
                break;
            case 'S':
                cout << "数据已经排序. " << endl;
                break;
            case 'Q':
                exit(0);
                break;
            default:
                break;
        }
    }

    return 0;
}

