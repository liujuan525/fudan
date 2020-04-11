#include <iostream>
using namespace std;

// 编写程序输出以下图案
int main() {
    const int N = 4;
    for (int i = 1; i <= N; i++)
    {
        for (int j = 1; j <= 30; j++)
        {
            cout<<" ";
        }
        for (int j = 1; j <= 8 - 2 * i; j++)
        {
            cout<<" ";
        }
        for (int j = 1; j <= 2 * i - 1; j++)
        {
            cout<<"*";
        }
        cout<<endl;
        
    }
    for (int i = 0; i <= N - 1; i++)
    {
        for (int j = 1; j <= 30; j++)
        {
            cout<<" ";
        }
        for (int j = 1; j <= 7 - 2 * i; j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }

    return 0;
}



// int main() {
//     int a = 1;

//     for (int i = 1; i <= 7 ; i++)
//     {
//         while (i % 2 != 0)
//         {
//             for ( int n = 0; n <= i; n++)
//             {
//                 cout<<"*";
//             }
            
//         }
//         cout<<"\n";
//     }
//     cout<<endl;

//     return 0;
// }