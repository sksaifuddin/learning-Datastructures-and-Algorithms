#include<stdio.h>
int main()  {
    // delcare a variable and assign value to it
    int var = 10;
    // declare a pointer
    int *pointerToTheValue;

    //store the value of the value in the pointer

    pointerToTheValue = &var;
     
     printf("the address of the value is %x :\n", &var);
     printf("the address of the pointer is %x:\n", pointerToTheValue);
     printf("the value of the value is %d\n", *pointerToTheValue);

}