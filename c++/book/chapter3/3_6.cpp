/*
 * @Author: may
 * @Date: 2020-04-20 23:13:53
 */
// 3_6:投骰子的随机游戏
// 游戏规则：每个骰子有6面，点数分别为1，2，3，4，5，6，游戏者在开始时输入一个无符号整数，作为产生随机数的种子。每轮投两次骰子，第一轮如果和数为 7 或 11 则为胜，游戏结束；和数为 2，3 或 12，则为负，游戏结束；和数为其他值则将此值作为自己的点数，继续第二轮、第三轮...直到某轮的和数等于点数则取值，若在此前出现和数为 7 则为负
#include  <iostream>
#include <cstdlib>
using namespace std;

// 投骰子，计算和数，输出和数
int rollDice()
{
    int die1 = 1 + rand() % 6;
    int die2 = 1 + rand() % 6;
    int sum = die1 + die2;
    cout<<"player rolled "<<die1<<" + "<<die2<<" = "<<sum<<endl;
    return sum;
}

enum GameStatus {WIN, LOSE, PLAYING};

int main()
{
    int sum, myPoint;
    GameStatus status;

    unsigned seed;
    cout<<"Please enter an unsigned integer:";
    cin>>seed;
    // 将种子传递给 rand()
    srand(seed);
    // 第一轮投骰子，计算和数
    sum = rollDice();
    switch (sum)
    {
        case 7:
        case 11:
            status = WIN;
            break;
        case 2:
        case 3:
        case 12:
            status = LOSE;
            break;
        // 游戏无结果，记下点数，为下一轮做准备
        default:
            status = PLAYING;
            myPoint = sum;
            cout<<"poit is:"<<myPoint<<endl;
            break;
    }

    // 当状态是 PLAYING 时，继续进行下一轮
    while (status == PLAYING)
    {
        sum = rollDice();
        if (sum == myPoint) {
            status = WIN;
        } else if (sum == 7) {
            status = LOSE;
        }
    }

    // 当状态不是 PLAYING 时，上面的循环结束，输出游戏结果
    if (status == WIN) {
        cout<<"player wins"<<endl;
    } else {
        cout<<"player loses"<<endl;
    }

    return 0;
}




