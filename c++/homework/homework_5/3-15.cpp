/*
 * @Descripttion: 3-15: 编写递归函数 getPower 计算 x的y次幂，在同一个程序中针对整型和实型实现两个重载的函数 
 * int getPower(int x, int y); // 整型形式，当 y<0 时，返回0 
 * double getPower(double x, int y); // 实型形式
 * 在主程序中实现输入输出，分别输入一个整数 a 和一个实数 b 作为底数，再输入一个整数 m 作为指数，输出 a的m次幂 和 b的m次幂。另外请读者思考，如果在调用 getPower 函数计算 a的m次幂时希望得到一个实型结果（实型结果表示范围更大，而且可以准确表示 m<0 时的结果），该如何调用？
 * @Author: may
 * @Date: 2020-05-31 19:40:24
 */ 
#include <iostream>