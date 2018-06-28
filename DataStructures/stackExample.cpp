#include<iostream>
using namespace std;

class Stack {
    int top;
   
    public :
    int count;
    int a[10];
     Stack() {
        top = -1;
    }
    bool push(int x);
    int pop( );
    void display();
};

bool Stack :: push(int valueToPush) {
    if(top >= 10) {
        cout<<"stack is Full\n";
        return false;
    }
    else {
        a[++top] = valueToPush;
        cout << "the value " << valueToPush <<" is pushed " << endl;
         count++;
        return true;
       
    }
}

int Stack :: pop( ) {
    if( top == -1 ) {
        cout << "Stack is Empty\n";
        return 0;
    } else {
        int valueToPop = a[top--];
        cout << "The value "<<valueToPop<<" is poped " << endl ;
         count--;
        return valueToPop;
    }
}

void Stack :: display() {
    for( int i=0 ; i <= count ; i++ ) {
        cout << " The values of the stack is :" << a[i] << endl ;
    }
}

int main() {
    Stack object;
    object.push(10);
    object.push(20);
    object.display();
    object.pop();
    object.pop();
    object.display();
   

}