/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
// 2-32：在程序中定义一个整型变量，赋予 1-100 的值，要求用户猜这个数，比较两个数的大小，把结果提示给用户，直到猜对为止。分别使用while,do...while语句实现循环
#include <iostream>
using namespace std;

// while
// int main()
// {
//     int guess = 88, user;

//     Guess:cout<<"请输入你猜测的值：";
//     cin>>user;
//     while (user != guess)
//     {
//         if (user > guess) {
//             cout<<"你猜大了！"<<"\n";
//             goto Guess;
//         } else {
//             cout<<"你猜小了！"<<"\n";
//             goto Guess;
//         }
//     }
//     cout<<"你猜对了！"<<endl;
    
//     return 0;
// }

// do...while
int main()
{
    int guess = 66, user = 1;
    for (; user <= 100;)
    {
        cout<<"请输入值：";
        cin>>user;
        do
        {
            if (user == guess) {
                cout<<"你猜对了!";
                goto End;
            } else {
                if (user > guess) {
                    cout<<"你猜大了！"<<"\n";
                    break;
                } else {
                    cout<<"你猜小了！"<<"\n";
                    break;
                }
            }
        } while (user != guess);
    }
    cout<<endl;
    End:cout<<"运行结束！";
    return 0;
}