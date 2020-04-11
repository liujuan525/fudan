#include <iostream>
using namespace std;

// 比较两个数的大小
int main() {
    int x, y;
    cout<<"Enter x and y:";
    x = 5; 
    y = 8;

    // cin>>x>>y;

    if (x != y) {
        if (x < y) {
            cout<<"x<y"<<endl;
        } else {
            cout<<"x>y"<<endl;
        }
    } else {
        cout<<"x=y"<<endl;
    }

    return 0;
}

