// Following are the steps involved in bubble sort(for sorting a given array in ascending order):

// 1)Starting with the first element(index = 0), compare the current element with the next element of the array.
// 2)If the current element is greater than the next element of the array, swap them.
// 3)If the current element is less than the next element, move to the next element. Repeat Step 1.

#include<iostream>
using namespace std;
#define SIZE 5
int main() {
   int a[SIZE] = { 5,12,14,6,2 };
   int temp;
   for( int i=0;i < SIZE ;i++ ) {
       for(int j=0;j < SIZE-i-1;j++ ) {
           if(a[j]>a[j+1]){
               // swap the numbers
               temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
           }
       }
   }
   for( int i=0;i<SIZE;i++ ) {
       cout << "The sorted array is :" <<endl;
       cout << a[i] << endl;
   }
}