/*
 * @Descripttion: 5-13题
 * @Author: may
 * @Date: 2020-05-31 18:58:02
 */ 
#ifndef MY_X_Y_Z_H
class X;
class Y
{
    public:
        void g(X*);
};
class X
{
    private:
        int i;
    public:
        X() { i = 0;}
    friend void h(X*);
    friend void Y::g(X*);
    friend class Z;
};
void h(X* x) { x->i += 10; }
void Y::g(X* x) { x->i++; }
class Z
{
    public:
        void f(X* x) { x->i += 5; }
};

#endif
