/*
 * @Descripttion: 汉诺塔问题
 * @Author: may
 * @Date: 2020-04-25 16:23:16
 */
// 有三根针 A,B,C，A针上有 n 个盘子，盘子大小不等，大的在下，小的在上，要求把这 n 个盘子从 A 针移动到 C 针，在移动过程中可以借助 B 针，每次只允许移动一个盘，且在移动过程中在三根针上都保持大盘在下，小盘在上。
#include <iostream>
using namespace std;

// 将 src 针的最上面一个盘子移动到 dest 针上
void move(char src, char dest)
{
    cout<<src<<" -->"<<dest<<endl;
}

// 将 n 个盘子从 src 针移动到 dest 针，以 medium 针作为中介
void hanoi(int n, char src, char medium, char dest)
{
    if (n == 1)
    {
        move(src, dest);
    }
    else
    {
        hanoi(n - 1, src, dest, medium);
        move(src, dest);
        hanoi(n - 1, medium, src, dest);
    }
    
}

int main()
{
    int m;
    cout<<"Enter the number of diskes:";
    cin>>m;
    cout<<"the steps to moving "<<m<<" diskes:"<<endl;
    hanoi(m, 'A', 'B', 'C');

    return 0;
}




