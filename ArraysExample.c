#include<stdio.h>
int main() {
    // Declare an array
    int numbers[10];
    // Assign the numbers from 1 to 10 to all the indexes
    for( int i=0 ; i<10;i++ ) {
        numbers[i] = i;
        printf("this is numbers %d",numbers[i]);
    }
}