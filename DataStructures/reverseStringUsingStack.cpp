// ALGORITHM
// ---------
// 1) Create an empty stack.
// 2) One by one push all characters of string to stack.
// 3) One by one pop all characters from stack and put 
//    them back to string.

#include<iostream>
using namespace std;

class reverseString {
    int top;
    public:
    reverseString() {
        top = -1;
    }
    char a[4];
    void push(char x);
    char pop();
};

void reverseString :: push( char x ) {
    if( top >= 4 ) {
        cout << "The stack is full"<<endl; 
    } else {
        a[++top] = x;
        cout << "The character is pushed:" << x << endl;
    }
}

char reverseString :: pop() {
    if(top == -1 ) {
        cout << "The stack is empty"<<endl;
        return 0;
    } else {
        char x = a[top--];
        return x;
    }
}

int main() {
    reverseString object;
    object.push('s');
    object.push('a');
    object.push('i');
    object.push('f');
    cout<<"the reverse of the string is :"<< object.pop();
    cout << object.pop();
    cout << object.pop();
    cout << object.pop();
}
