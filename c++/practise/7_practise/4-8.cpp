/*
 * @Descripttion: 定义一个 Dog 类，包含了 age,weight 等属性，以及对这些属性操作的方法，实现并测试这个类
 * @Author: may
 * @Date: 2020-05-24 18:36:22
 */ 
#include <iostream>
using namespace std;

class Dog
{
    public:
        Dog (int initialAge = 0, int initialWeight = 5);
        ~Dog();
        int GetAge() { return itsAge;} // inline!
        void SetAge (int age) { itsAge = age;} // inline!
        int GetWeight() { return itsWeight;} // inline!
        void SetWeight (int weight) { itsWeight = weight;} // inline!
    private:
        int itsAge, itsWeight;
};

Dog::Dog(int initialAge, int initialWeight)
{
    itsAge = initialAge;
    itsWeight = initialWeight;
}

Dog::~Dog() //destructor， takes no action
{

}

int main()
{
    Dog Jack(2, 10);
    cout << "Jack is a Dog who is " ;
    cout << Jack.GetAge() << " years old and ";
    cout << Jack.GetWeight() << " pounds weight.\n";

    Jack.SetAge(7);
    Jack.SetWeight(20);
    cout << "Now Jack is " ;
    cout << Jack.GetAge() << " years old and ";
    cout << Jack.GetWeight() << " pounds weight.";

    return 0;
}

