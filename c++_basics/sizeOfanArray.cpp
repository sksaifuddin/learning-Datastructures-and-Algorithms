#include<iostream>
using namespace std;
int main() {
    int a[5] = { 6 , 8, 4, 2, 5 };
    cout << "The total memory allocated to array is :" << sizeof(a) <<endl;
    cout << "The memory of each element in array is :" << sizeof(a[0]) << endl;
    int sizeOfArray = sizeof(a) / sizeof(a[0]);
    cout << "The size of the array is :"<< sizeOfArray;
}