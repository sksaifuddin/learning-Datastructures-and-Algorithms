#include<stdio.h>
// declare a function
int factorial(int);
int main(){
    // function call
    printf("The factorial of 3 is %d\n",factorial(3));
    printf("The factorial of 5 is %d\n",factorial(5));
    return 0;
}
// function definition
int factorial(int num){
    if(num == 1) {
        return num;
    } else if(num > 1) {
        return num * factorial(num - 1);
    }
}