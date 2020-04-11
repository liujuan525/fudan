/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
// 实现一个简单的菜单程序，运行时显示”Menu:A(dd) D(elete) S(ort) Q(uit),Select one:"提示用户输入，A 表示增加，D表示删除，S表示排序，Q表示退出，输入为 A、D、S时分别提示“数据已经添加、删除、排序。”，输入为Q时，程序结束
#include <iostream>
using namespace std;

// （1）要求使用 if...else 语句进行判断，用 break,continue 控制程序流程
// int main()
// {
//     string order;
//     Continue:cout<<"Menu:A(dd) D(elete) S(ort) Q(uit),Select one:";
//     cin>>order;

//     for (; order != "Q"; )
//     {
//         if (order == "D") {
//             cout<<"数据已经删除"<<"\n";
//         } else if (order == "O") {
//             cout<<"数据已经排序"<<"\n";
//         } else if (order == "A"){
//             cout<<"数据已经添加"<<"\n";
//         } else{
//             cout<<"输入错误！"<<"\n";
//         }
//         // 再次输入值
//         cin>>order;
//         if (order == "Q") {
//             cout<<"程序结束！";
//             break;
//         } else {
//             continue;
//         }
//     }
//     cout<<endl;

//     return 0;
// }

// (2)要求使用 switch 语句
int main()
{
    Continue:cout<<"Menu:A(dd) D(elete) S(ort) Q(uit),Select one:";
    string order;
    cin>>order;
    char result;
    if (order == "A") 
        result = 1;
    else if (order == "D") 
        result = 2;
    else if (order == "O") 
        result = 3;
    else if (order == "Q") 
        result = 4;
    else
        result = 5;
    

    for (; order != "Q"; )
    {
        switch (result)
        {
        case 1:
            cout<<"数据已经添加"<<"\n";
            break;
        case 2:
            cout<<"数据已经删除"<<"\n";
            break;
        case 3:
            cout<<"数据已经排序"<<"\n";
            break;
        default:
            cout<<"输入错误！"<<"\n";
            break;
        }
        // 再次输入值
        cin>>order;
        if (order == "Q") {
            cout<<"程序结束！";
            break;
        } else {
            continue;
        }
    }
    cout<<endl;

    return 0;
}