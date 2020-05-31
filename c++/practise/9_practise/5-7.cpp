/*
 * @Descripttion: 5-7: 定义一个 Cat 类，拥有静态数据成员 numOfCats，记录 Cat 的个体数目，静态成员函数 getNumOfCats(),读取 numOfCats.设计程序测试这个类，体会静态数据成员和静态成员函数的用法
 * @Author: may
 * @Date: 2020-05-24 17:57:14
 */ 
#include <iostream>
using namespace std;
class Cat
{
    public:
        Cat(int age): itsAge(age) { numOfCats++; }
        virtual ~Cat() { numOfCats--; }
        virtual int GetAge() { return itsAge; }
        virtual void SetAge(int age) { itsAge = age; }
        static int getNumOfCats() { return numOfCats; }
    private:
        int itsAge;
        static int numOfCats;
};
int Cat::numOfCats = 0;
void TelepathicFunction();
int main()
{
    const int MaxCats = 5;
    Cat *CatHouse[MaxCats];
    int i;
    for ( i = 0; i < MaxCats; i++)
    {
        CatHouse[i] = new Cat(i);
        TelepathicFunction();
    }
    for ( i = 0; i < MaxCats; i++)
    {
        delete CatHouse[i];
        TelepathicFunction();
    }
    
    return 0;
}

void TelepathicFunction()
{
    cout<<"there are "<<Cat::getNumOfCats()<<" cats alive!\n";
}
