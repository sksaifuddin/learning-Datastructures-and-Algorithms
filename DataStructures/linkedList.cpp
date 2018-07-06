#include<iostream>
using namespace std;

class Node {
    public:
    int data;

    // pointer to the  next node
    Node *next;

    Node() {
        data = 0;
        next = NULL;
    }

    Node(int x) {
    data = x;
    next = NULL;
  }

};

class LinkedList {
    public :
    Node *head;

    int addAtFront( Node *newNode );
    int addAtLast(Node *NewNode);
    int isEmpty();
    Node* searchNode( int valueToSearch );
    Node* deleteNode(int valueToDelete);
    void display();

    LinkedList() {
        head = NULL;
    }

};

int LinkedList :: addAtFront(Node *newNode) {

int i=0;
// make the next point to the head
newNode->next = head;
// make the head point to the new node.
head = newNode;
i++;
// returning the position  where node is added.
return i;

}

int LinkedList :: addAtLast(Node *newNode) {
    // if the LinkedList is empty add at the first position as same with adding at front
    if( head == NULL ) {
        head = newNode;
        newNode -> next = NULL;
        
    } else {
        // get the last Node 
          //creating a pointer pointing to Head
        Node* ptr = head;
         //Iterating over the list till the node whose Next pointer points to null
        while( ptr -> next != NULL ) {
            ptr = ptr -> next;
        }
    Node *lastNode = ptr;
    // point the last node's next to new node;
    lastNode ->next = newNode;
            }
}

Node* LinkedList :: searchNode( int x ) {
    //Traverse the linked list till it gets the desired value
    Node* ptr = head;
    while( ptr ->next != NULL || ptr -> data != x ) {
        ptr = ptr -> next;
    }
    return ptr;
}

Node* LinkedList :: deleteNode(int x) {
    Node *nodeToBeDeleted = searchNode(x);
    Node *ptr = head;
    // check if the node to be deleted is first node;
    if( ptr == nodeToBeDeleted ) {
        ptr ->next = nodeToBeDeleted ->next;
        return nodeToBeDeleted;
    }
    else {
        while( ptr ->next != nodeToBeDeleted ) {
            ptr = ptr -> next;
        }
        ptr -> next = nodeToBeDeleted ->next;
        return nodeToBeDeleted;
    }
}

int LinkedList :: isEmpty() {
    if(head == NULL) {
        return 1;
    } else {
        return 0;
    }
}

void LinkedList :: display() {
    int emptyFlag = isEmpty();
    if(emptyFlag == 1) {
        cout << "LinkedList is Empty" << endl;
    } else {
        Node *ptr = head;
         cout << "The values is linkedlist are :" << endl;
        cout << head ->data << endl;
        while( ptr ->next != NULL ) {
             ptr = ptr -> next;
            cout << ptr -> data << endl;
        }
    }
}

int main() {
    LinkedList object;
    Node *n,*n1,*n2;
    n = new Node(5);
      n1 = new Node(6);
        n2 = new Node(7);      

    object.addAtFront(n);
    object.addAtFront(n1);
    object.addAtFront(n2);
     int flag = object.isEmpty();
     if(flag == 1) {
         cout << "linkedList is empty " << flag << endl;
     }
    object.display();
}