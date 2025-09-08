#include <iostream>
using namespace std;

int main() {
    int myArray[5] = {1, 2, 3, 4, 5};
    
    cout << myArray[0] << endl;  
    cout << myArray[2] << endl; 
    
    for (int i = 0; i < 5; i++) {
        cout << myArray[i] << endl;
    }
    
    cout << sizeof(myArray) / sizeof(myArray[0]) << endl; 
    
    return 0;
}
