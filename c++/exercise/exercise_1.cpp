/*
 * @Descripttion: 填写 1-9 各一次，满足下列条件：(a1a2)*a3=a4a5,a4a5+a6a7=a8a9
 * @Author: may
 * @Date: 2020-04-21 22:02:22
 */
#include <iostream>
using namespace std;

int main()
{
    int a1, a2, a3, a4, a5, a6, a7, a8, a9;
    int num = 0;

    for ( a1 = 1; a1 < 10; a1++)
    {
        for ( a2 = 1; a2 < 10; a2++)
        {
            if (a2 == a1)
            {
                continue;
            } 
            else 
            {
                for ( a3 = 1; a3 < 10; a3++)
                {
                    if (a3 == a2 || a3 == a1)
                    {
                        continue;
                    }
                    else
                    {
                        for (a4 = 1; a4 < 10; a4++)
                        {
                            if (a4 == a3 || a4 == a2 || a4 == a1)
                            {
                                continue;
                            }
                            else
                            {
                                for (a5 = 1; a5 < 10; a5++)
                                {
                                    if (a5 == a4 || a5 == a3 || a5 == a2 || a5 == a1)
                                    {
                                        continue;
                                    }
                                    else
                                    {
                                        for (a6 = 1; a6 < 10; a6++)
                                        {
                                            if (a6 == a5 || a6 == a4 || a6 == a3 || a6 == a2 || a6 == a1)
                                            {
                                                continue;
                                            }
                                            else
                                            {
                                                for (a7 = 1; a7 < 10; a7++)
                                                {
                                                    if (a7 == a6 || a7 == a5 || a7 == a4 || a7 == a3 || a7 == a2 || a7 == a1)
                                                    {
                                                        continue;
                                                    }
                                                    else
                                                    {
                                                        for (a8 = 1; a8 < 10; a8++)
                                                        {
                                                            if (a8 == a7 || a8 == a6 || a8 == a5 || a8 == a4 || a8 == a3 || a8 == a2 || a8 == a1)
                                                            {
                                                                continue;
                                                            }
                                                            else
                                                            {
                                                                for (a9 = 1; a9 < 10; a9++)
                                                                {
                                                                    num++;
                                                                    if (a9 == a8 || a9 == a7 || a9 == a6 || a9 == a5 || a9 == a4 || a9 == a3 || a9 == a2 || a9 == a1)
                                                                    {
                                                                        continue;
                                                                    }
                                                                    else
                                                                    {
                                                                        if ((a1 * 10 + a2) * a3 == a4 * 10 + a5 && (a4 * 10 + a5) + (a6 * 10 + a7) == (a8 * 10 + a9))
                                                                        {
                                                                            cout<<a1*10+a2<<"*"<<a3<<"="<<a4*10+a5<<"+"<<a6*10+a7<<"="<<a8*10+a9<<endl;
                                                                        }
                                                                    }
                                                                    
                                                                }
                                                                
                                                            }
                                                            
                                                        }
                                                        
                                                    }
                                                    
                                                }
                                                
                                            }
                                            
                                        }
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
            
        }
        
    }
    cout<<"\n"<<"运行了"<<num<<"次"<<endl;

    return 0;
}







