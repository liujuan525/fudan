/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
// 2-12：写一条 for 语句，计算条件为 n 从 100 到 200，步长为 2，然后用 while 和 do...while 循环完成同样的循环
#include <iostream>
using namespace std;

// for 语句
// int main()
// {
//     for (int n = 100; n <= 200;)
//     {
//         cout<<"n 的值为："<<n<<"\n";
//         n += 2;
//     }
//     cout<<endl;
//     return 0;
// }

// do...while 语句
int main()
{
    int n = 100;
    do
    {
        cout<<"n 的值为："<<n<<"\n";
        n += 2;
    } while (n <= 200);
    
    cout<<endl;

    return 0;
}
