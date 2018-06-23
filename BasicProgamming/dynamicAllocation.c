#include<stdio.h>
#include<stdlib.h>
// define a struct
typedef struct {
    char * name;
    int age;
} person;

int main() {
    //create a pointer and dynamically assign a value using malloc()
  person * myperson = malloc(sizeof(person));
    myperson->name = "John";
    myperson->age = 27;
    printf("The name of the person is %s\n",myperson->name);
    printf("The age of the person is %d\n",myperson->age);
}