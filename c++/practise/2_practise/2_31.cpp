/*
 * @Author: may
 * @Date: 2020-04-11 17:06:04
 */
// 声明一个表示时间的结构体，可以精确表示年、月、日、小时、分、秒；提示用户输入年、月、日、小时、分、秒的值，然后完整地显示出来
#include <iostream>
using namespace std;

int main()
{
   int year, month, day, hour, minute, second;
   cout<<"请输入年：";
   cin>>year;
   cout<<"请输入月：";
   cin>>month;
   cout<<"请输入日：";
   cin>>day;
   cout<<"请输入小时：";
   cin>>hour;
   cout<<"请输入分：";
   cin>>minute;
   cout<<"请输入秒：";
   cin>>second;
   cout<<"您输入的时间为："<<year<<"-"<<month<<"-"<<day<<" "<<hour<<":"<<minute<<":"<<second;
   cout<<endl;
   
   return 0; 
}



