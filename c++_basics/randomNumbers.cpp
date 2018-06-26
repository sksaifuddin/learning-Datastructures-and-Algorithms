#include<iostream>
unsigned int numberGenerator() {
    // seed is the starting point of the number generator
   static unsigned int seed = 5678;
    seed = 3434566 * seed + 428944;

    return seed % 325534 ;
}

int main() {
    int count;
    std::cout << "Give the number of random numbers to be generated"<< std::endl;
    std::cin >> count; 
    for( int i=1; i <= count;i++ ) {
        std::cout << numberGenerator() << "\t";

        //if we print five numbers then print in next line
        if(i % 5 == 0) {
            std::cout << "\n";
        }
    }
    return 0;
}