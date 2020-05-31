/*
 * @Descripttion: 定义 Boat 与 Car 两个类，两者都有 weight 属性，定义二者的一个友元函数 getTotalWeight()，计算二者的重量和
 * @Author: may
 * @Date: 2020-05-24 17:57:27
 */ 
#include <iostream>
using namespace std;
class Boat;
class Car
{
    private:
        int weight;
    public:
        Car(int j) { weight = j;}
    friend int totalWeight(Car &aCar, Boat &aBoat);
};

class Boat
{
    private:
        int weight;
    public:
        Boat(int j) { weight = j;}
    friend int totalWeight(Car &aCar, Boat &aBoat);
};

int totalWeight(Car &aCar, Boat &aBoat)
{
    return aCar.weight + aBoat.weight;
}

int main()
{
    Car c1(4);
    Boat b1(5);
    cout<<totalWeight(c1,b1) <<endl;
    return 0;
}

