// Q .2) Write code to reverse the string

#include<iostream>
using namespace std;

string reverseString(string word) {
    cout <<"The reverse of the word is:"<<endl;
    for( int i=word.length()-1;i>=0;i-- ){
            cout<<word[i]<<endl;
    }
    return word;
}

int main() {
    string word = "saif";
    string result = reverseString(word);
    return 0;
}