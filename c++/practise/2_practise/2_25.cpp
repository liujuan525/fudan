/*
 * @Author: your name
 * @Date: 2020-04-11 14:46:31
 * @LastEditTime: 2020-04-11 15:39:51
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /c++/practise/2_practise/2_25.cpp
 */
// 2-25：若 a = 1,下列各式的结果是什么？
#include <iostream>
using namespace std;

int main()
{
    int a = 1;
    int one, two, three, four;
    one = !a|a;
    /**
     * !a = 0 = 0000 0000 
     * 0 | 1 = 0000 0001 = 1
     */ 
    two = ~a|a;
    /**
     * ~按位取反：是一个单目运算符，其作用是对一个二进制数的每一位取反
     * ~a = 1111 1110
     * ~a|a = 1111 1111 = -1
     */ 
    three = a^a;
    /**
     * a^a = 0000 0000 = 0
     */ 
    four = a>>2;
    /**
     * >>右移运算：将一个数的二进制值向右移位，右移后，移出的低位舍弃，如果是无符号数则高位补0，如果是有符号数，则高位补符号位或补0
     * <<左移运算：按照指定的位数将一个数的二进制值向左移位，左移后，低位补0，移出的高位舍弃
     * a>>2 = 0000 0000 = 0
     */ 

    cout<<"第一题的结果为："<<one<<"\n";
    cout<<"第二题的结果为："<<two<<"\n";
    cout<<"第三题的结果为："<<three<<"\n";
    cout<<"第四题的结果为："<<four<<"\n";
    cout<<endl;

    return 0;
}