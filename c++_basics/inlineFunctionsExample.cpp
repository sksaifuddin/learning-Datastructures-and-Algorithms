
// Cpp offers a way to combine the advantages of functions with the speed of code written in-place: inline functions. 
// The inline keyword is used to request that the compiler treat your function as an inline function. 
// When the compiler compiles your code, all inline functions are expanded in-place -- that is, the function call is replaced with a copy of the contents of the function itself, which removes the function call overhead!
// The downside is that because the inline function is expanded in-place for every function call, this can make your compiled code quite a bit larger, especially if the inline function is long and/or there are many calls to the inline function.

#include<iostream>
inline int min(int x , int y)  {
    return x > y ? y : x ; // if x is greater than y return y or return x
}

int main() {
    std::cout << "The min value is :"<< min(3,5);
}