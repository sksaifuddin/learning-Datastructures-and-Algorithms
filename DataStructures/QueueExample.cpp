#include<iostream>
using namespace std;
#define SIZE 5

class Queue {
    int a[SIZE];
    int head;
    int tail;
    public:
    Queue() {
        head = tail = -1; // indicates that queue is initially empty.
    }
    void enqueue(int x);
    int dequeue();
    void display();
};

void Queue :: enqueue(int x) {
    
    if( head == -1 ) {
        head ++; //increment head for first insertion
    }
    if( tail == SIZE-1 ) {
        cout << "Sorry Queue is full" << endl;
    } else {
         a[++tail] = x; // value is inserted
    }

}

int Queue :: dequeue() {
    if( tail == -1 ) {
        cout << "Queue is empty" <<endl;
    } else {
        return a[++head]; // increment head to remove the element
    }
}

void Queue :: display() {
    for( int i = head ; i <= tail ; i++ ) {
        cout << "The values are : "<< a[i] << endl;
    }
}

int main() {
    Queue object;
    object.enqueue(1);
    object.enqueue(2);
    object.enqueue(3);
    object.enqueue(4);
    object.enqueue(5);
    object.display();
    object.enqueue(6);
    object.dequeue();
    object.display();
}