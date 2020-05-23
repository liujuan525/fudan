/*
 * @Descripttion: 类的定义
 * @Author: may
 * @Date: 2020-05-17 21:51:26
 */
class point
{
private:
    int x, y;
    static int count;
public:
    point(int x=0, int y=0) : x(x), y(y) {}
    point(const point &p);
    ~point(){ count--; }
    int getX() const { return x; }
    int getY() const { return y; }
    static void showCount();
};
