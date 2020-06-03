/**
 * 2-28:（1）实现一个简单的菜单程序，运行时显示"Menu: A(dd) D(elete) S(ort) Q(uit)， Select one:"提示用户输入，A表示增加，D表示删除，S表示排序，Q表示退出，
 * 输入为A、D、S时分别提示"数据已经增加、删除、排序。"输入为Q时程序结束。要求使用if … else语句进行判断，用break、continue控制程序流程。
 */ 
#include <iostream>
using namespace std;

int main()
{
    char val, judge;
    while (1)
    {
        cout << "Menu: A(dd) D(elete) S(ort) Q(uit)， Select one:";
        cin >> val;
        judge = toupper(val);
        if (judge == 'A')
        {
            cout << "数据已经增加. " << endl;
            continue;
        }
        else if (judge == 'D')
        {
            cout << "数据已经删除. " << endl;
            continue;
        }
        else if (judge == 'S')
        {
            cout << "数据已经排序. " << endl;
            continue;
        }
        else if (judge == 'Q')
        {
            break;
        }
    }

    return 0;
}


