/*
 * @Descripttion: 3-2：观察下面程序的运行输出，与你设想的有何不同？仔细体会引用的用法
 * @Author: may
 * @Date: 2020-05-31 19:41:40
 */ 
#include <iostream>
using namespace std;

int main()
{
    int intOne;
    int &rSomeRef = intOne;

    intOne = 5;
    cout<<"intOne:\t"<<intOne<<endl;
    cout<<"rSomeRef:\t"<<rSomeRef<<endl;

    int intTwo = 8;
    rSomeRef = intTwo;
    cout<<"\nintOne:\t"<<intOne<<endl;
    cout<<"intTwo:\t"<<intTwo<<endl;
    cout<<"rSomeRef:\t"<<rSomeRef<<endl;

    return 0;
}