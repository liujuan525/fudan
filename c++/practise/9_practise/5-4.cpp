/*
 * @Descripttion: 5-4: 假设有两个无关系的类 Engine 和 Fuel，使用时，怎样允许 Fuel 成员访问 Engine 中的私有和保护的成员
 * @Author: may
 * @Date: 2020-05-31 17:41:28
 */ 

class Fuel;
class Engine
{
    friend class Fuel;
    private:
        int powerLevel;
    public:
        Engine() { powerLevel = 0; }
        void engine_fn(Fuel &f);
};
class Fuel
{
    friend class Engine;
    private:
        int fuelLevel;
    public:
        Fuel() { fuelLevel = 0; }
        void fuel_fn(Engine &e);
};