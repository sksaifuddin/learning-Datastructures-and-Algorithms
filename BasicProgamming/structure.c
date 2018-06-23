#include<stdio.h>

struct dog
{
    char name[10];
    char breed[10];
    int age;
    char color[10];
};

int main(){             //name   //breed  //age //color
    struct dog myDog = { "tiger","bull dog",2,"white"}; // asssigning values to the arrays in structre
    struct dog *pointerToDog;
    pointerToDog = &myDog;
    printf("The name of the Dog is %s \n",pointerToDog->name);
    printf("The breed of the dog is %s \n",pointerToDog->breed);
    printf("The age of the Dog is %d \n",pointerToDog->age);
    printf("The color of the Dog is %s \n",pointerToDog->color);
    return 0;
}