package chapter2;

import java.util.Scanner;

public class Practise_2_7 {
    public static void main(String[] args) {
        double annualInterestRate;
        int year;
        long total;
        double monthMoney, totalMoney;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入贷款的年利率：");
        annualInterestRate = input.nextDouble();
        System.out.println("请输入贷款的总金额：");
        total = input.nextLong();
        System.out.println("请输入贷款的年数：");
        year = input.nextInt();
        monthMoney = (total * annualInterestRate) / (1 - 1 / Math.pow((1 + annualInterestRate), year * 12));
        System.out.println("月支付金额为：" + monthMoney);
        totalMoney = annualInterestRate * total * year + total;
        System.out.println("总偿还金额为：" + totalMoney);

//答案

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年利率：");
        double annualRate = sc.nextDouble();
        double monthlyRate = annualRate / 1200;  // 计算月利率
        System.out.print("请输入贷款总额：");
        double loanAmount = sc.nextDouble();
        System.out.print("请输入年数：");
        double numberOfYear = sc.nextDouble();

        double monthlyPayment = loanAmount*monthlyRate / (1 -
                1/Math.pow(1 + monthlyRate,numberOfYear * 12));
        double totalPayment = monthlyPayment*12*numberOfYear;
        System.out.printf("月支付额：%.2f%n",monthlyPayment);
        System.out.printf("总支付额：%.2f%n",totalPayment);


    }
}
