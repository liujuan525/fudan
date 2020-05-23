/*
 * @Descripttion: 使用数组名作为函数参数
 * 主函数中初始化一个矩阵并将每个元素都输出，然后调用子函数，分别计算每一行的元素之和，将和直接存放在每行的第一个元素中
 * 返回主函数之后输出各行元素的和
 * @Author: may
 * @Date: 2020-05-23 14:07:48
 */ 
#include <iostream>
using namespace std;

// 计算二维数组 a 每行元素的值的和，nRow 是行数
/*
 * @Descripttion: 使用数组名作为函数参数
 * 主函数中初始化一个矩阵并将每个元素都输出，然后调用子函数，分别计算每一行的元素之和，将和直接存放在每行的第一个元素中
 * 返回主函数之后输出各行元素的和
 * @Author: may
 * @Date: 2020-05-23 14:07:48
 */ 
#include <iostream>
using namespace std;

// 计算二维数组 a 每行元素的值的和，nRow 是行数
void RowSum(int A[][4], int nrow)
{	
	int sum;
	for (int i = 0; i < nrow; i++)
	{
		sum = 0;
		for(int j = 0; j < 4; j++)
			sum += A[i][j];
		cout << "Sum of row " << i  << " is " << sum << endl;
		A[i][0]=sum;
	}
} 
int main(void)
{	
    // 声明并初始化数组
	int Table[3][4] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
	int i;
    // 输出数组元素
	for (i = 0; i < 3; i++)
	{	
		for (int j = 0; j < 4; j++)
			cout << Table[i][j] << "   ";
		cout << endl;
	}
    // 调用子函数，计算各行和
	RowSum(Table,3);
	
	for (i = 0; i < 3; i++)
	{	
		for (int j = 0; j < 4; j++)
			cout << Table[i][j] << "   ";
		cout << endl;
	}
	
	for (i = 0; i < 3; i++)
		cout << Table[i][0]<<"   ";
	cout<<endl;
}





