#include<stdio.h>
int myFunction(int value);
int main() {
    //call the function
    printf("the value of a is %d",myFunction(911));
}
// Function Definiton
 int myFunction(int value) {
    return value;
}