#include <iostream>
using namespace std;

int main()
{
    int i = 2, N = 0;

    do
    {
        bool flag = true;
        for (int j = 2; j < i; j++)
        {
            if (i % j == 0) 
            {
                flag = false;
                break;
            }
        }
        if (flag == true)
        {
            cout<<i<<"\n";
            N += 1;
        }
        i++;
    } while (i < 100);
    
    cout<<"共有："<<N<<" 个质数。"<<endl;

    return 0;
}