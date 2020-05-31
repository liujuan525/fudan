/*
 * @Descripttion: 个人银行账户管理程序
 * 包含三个文件：account.h  account.cpp 5-11.cpp
 * @Author: may
 * @Date: 2020-05-24 16:19:18
 */ 
#include <iostream>
#include "account.cpp"
using namespace std;

int main()
{
    // 建立几个账户
    SavingAccount sa0(1, 21325302, 0.015);
    SavingAccount sa1(1, 58320212, 0.015);
    // 几笔账目
    sa0.deposit(5, 5000);
    sa1.deposit(25, 10000);
    sa0.deposit(45, 5500);
    sa1.withdraw(60, 4000);
    // 开户后第 90 天到了银行的计息日，结算所有账户的年息
    sa0.settle(90);
    sa1.settle(90);
    // 输出各个账户信息
    sa0.show(); cout<<endl;
    sa1.show(); cout<<endl;
    cout<<"total: "<<SavingAccount::getTotal()<<endl;

    return 0;
}

