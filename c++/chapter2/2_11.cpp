#include <iostream>
using namespace std;

// 设某次体育比赛的结果有 4 种可能：胜（WIN）、负（LOSE）、平局（TIE）、比赛取消（CANCEL），编写程序顺序输出这 4 种情况
enum GameResult {WIN, LOSE, LIE, CANCEL};
int main() {
    GameResult result;
    enum GameResult omit=CANCEL;

    for (int count = WIN; count <= CANCEL; count++)
    {
        result = GameResult(count);
        if (result == omit) {
            cout<<"The game was canceled"<<endl;
        } else {
            cout<<"The game was played";
            if (result == WIN) {
                cout<<"and we won";
            } else if (result == LIE){
                cout<<"and we not win or lost";
            } else {
                cout<<"and we lost";
            }
            cout<<endl;
        }
    }

    return 0;
}

