#include <iostream>
using namespace std;

// 2-3:请用 c++ 语句声明一个常量 PI，值为 3.1416，再声明一个浮点型变量 a，把 PI 的值赋值给 a
// int main()
// {
//     const float PI = 3.1416;
//     cout<<"PI 的值为："<<PI<<"\n";
//     float a; 
//     a = PI;
//     cout<<"a 的值为："<<a;
//     cout<<endl;

//     return 0;
// }

// 2-5：再下面的枚举类型中，BLUE 的值是多少？
// int main()
// {
//     enum Color {WHITE, BLACK=100, RED, BLUE, GREEN=3001};

//     for (int i = WHITE; i <= GREEN; i++)
//     {
//         if (i == BLUE)
//         {
//             cout<<(Color)i<<endl;
//         }
//     }

//     return 0;
// }

// 2-8:下列表达式的值是多少
// int main()
// {
//     int a, b, c;
//     a = 201 / 4;
//     cout<<"a 的值为："<<a<<"\n";
//     b = 201 % 4;
//     cout<<"b 的值为："<<b<<"\n";
//     c = 201 / 4.0;
//     cout<<"c 的值为："<<c<<"\n";
//     cout<<endl;

//     return 0;
// }

// 2-9: 执行完下列语句后，a,b,c 三个变量的值为多少
// int main()
// {
//     int a, b, c;
//     a = 30;
//     b = a++;
//     c = ++a;
//     cout<<"a 的值为："<<a<<"\n";
//     cout<<"b 的值为："<<b<<"\n";
//     cout<<"c 的值为："<<c<<"\n";
//     cout<<endl;

//     return 0;
// }

// 2-10:在一个 for 语句中，可以给多个变量赋初值吗？如何实现？
// int main()
// {
//     int k;
//     for (int i = 0, j= 10; i < j; i++, j--)
//     {
//         k = i + j;
//     }
//     cout<<"K 的值为："<<k<<endl;

//     return 0;
// }

// 2-11:执行完下列语句后，n 的值为多少？
int main()
{
    int n;
    for (n = 0; n < 100; n++)
    {
        cout<<"n 的值为："<<n<<endl;
    }
    cout<<"\n n 的最终值为："<<n<<endl;
    return 0;
}




