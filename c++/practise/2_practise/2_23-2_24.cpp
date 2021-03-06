#include <iostream>
using namespace std;

// 2-23:写出下列表达式的值
// int main(int argc, char const *argv[])
// {
//     bool a, b, c;
//     a = 2 < 3 && 6 < 9;
//     cout<<"a 的值为："<<a<<"\n";
//     b = !(4 < 7);
//     cout<<"b 的值为："<<b<<"\n";
//     c = !(3 > 5) || (6 < 2);
//     cout<<"c 的值为："<<c;
//     cout<<endl;

//     return 0;
// }

// 2-24：若 a = 1, b = 2, c = 3, 下列各式的结果是什么
int main()
{
    int a = 1, b = 2, c = 3;
    /**
     * 1:  0000 0001
     * 2:  0000 0010
     * 3:  0000 0011
     * -1: 1000 0001
     */
    int one, two, three, four;
    one = a | b - c;
    /** 
     * b - c = -1
     * | 按位或：可以将操作数中的若干位置1（其他位不变）
     * 1 | -1 = 1000 0001 = -1
    */
    two = a ^ b & - c;
    /**
     * ^按位异或：可以将操作数中的若干指定位反转。如果使某位与0异或，结果是该位的原值，如果使某位与1异或，则结果与该位原来的值相反
     * 补码就是负数在二进制中的表示方法
     * 反码+1=补码，原码取反为反码
     * 3 的原码为：0000 0011
     * 3 的反码为：1111 1100
     * 3 的补码为反码加1，即-3 = 1111 1101
     * b & - c = 0000 0000 = 0
     * a ^ 0 = 0000 0001 = 1 
     */ 
    three = a & b | c;
    /**
     * &按位与：可以将操作数中的若干位置0（其他位不变）
     * a & b = 0000 0000 = 0
     * 0 | c = 0000 0011 = 3
     */ 
    four = a | b & c;
    /**
     * b & c = 0000 0010 = 2
     * a | (b & c) = 0000 0011 = 3
     */ 
    cout<<"第一小题的结果为："<<one<<"\n";
    cout<<"第二小题的结果为："<<two<<"\n";
    cout<<"第三小题的结果为："<<three<<"\n";
    cout<<"第四小题的结果为："<<four<<"\n";

    cout<<endl;

    return 0;
}





