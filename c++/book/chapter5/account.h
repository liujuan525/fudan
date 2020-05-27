/*
 * @Descripttion: 
 * @Author: may
 * @Date: 2020-05-24 16:23:43
 */ 
#ifndef _ACCOUNT_H_
#define _ACCOUNT_H_
// 储存账户类
class SavingAccount
{
    private:
        int id; // 账号
        double balance; // 余额
        double rate; // 存款的年利率
        int lastDate; // 上次变更余额的日期
        double accumulation; // 余额按日累加之和
        static double total; // 所有账户的总金额
        // 记录一笔账，date 为日期，amount 为金额，desc 为说明
        void record(int date, double account);
        // 获得到指定日期为止的存款金额按日累计值
        double accumulate(int date) const {
            return accumulation + balance * (date - lastDate);
        }
    public:
        // 构造函数
        SavingAccount(int date, int id, double rate);
        int getId() const { return id;}
        double getBalance() const { return balance;}
        double getRate() const { return rate;}
        static double getTotal() { return total;}
        // 存入现金
        void deposit(int date, double amount);
        // 取出现金
        void withdraw(int date, double amount);
        // 结算利息，每年 1 月 1 日调用一次该函数
        void settle(int date);
        // 显示账户信息、
        void show() const;
};

#endif // _ACCOUNT_H_