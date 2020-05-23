/*
 * @Descripttion: void 类型指针的使用
 * @Author: may
 * @Date: 2020-05-23 18:20:54
 */ 
#include <iostream>
using namespace std;

int main()
{
    // 不能声明 void 类型的变量
    // void voidObject
    // 可以声明 void 类型的指针
    void * pv;
    int i = 5;
    // void 类型指针指向整型变量
    pv = &i;
    // void 类型指针赋值给 int 类型指针
    int * pint = static_cast<int *>(pv);
    cout<<"* pint="<<* pint<<endl;

    return 0;
}

