//Q.1)Implement an algorithm to determine if a string has all unique characters. What if you
// can not use additional data structures?

#include<iostream>
using namespace std;
bool findUniqueWord( string word) {
    for(int i=0;i< word.length();i++) {
        for(int j = i+1; j< word.length();j++ ){
            if(word[i]==word[j]){
                return false;
            } 
        }
    }
return true;
}

int main(){
    string word="DEBUG";
   bool result = findUniqueWord(word);
   if(result) {
       cout << "Word has unique charachters"<<endl;
   } else {
       cout << "Word doesnt have unique charachters"<<endl;
   }

    return 0;
}