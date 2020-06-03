/**
 * 6-10: 定义一个有五个元素的整型数组，在程序中提示用户输入元素值，最后再在屏幕上显示出来
 */ 
#include <iostream>
using namespace std;

int main()
{
    int myArray[5];

    for (int i = 0; i < 5; i++)
    {
        cout << "value for myArray[" << i << "]";
        cin >> myArray[i];
    }

    for (int i = 0; i < 5; i++)
    {
        cout << i << ":" << myArray[i] << "\n";
    }
    
    return 0;
}





