#include <iostream>
#include <fstream>
#include <vector>
#include <deque>
#include <algorithm>
#include <climits>
using namespace std;

ifstream inFile;
ofstream outFile;

int main(int argc, char const *argv[]) {
    inFile.open( (argc >= 2) ? argv[1] : "input.txt");
    outFile.open((argc >= 3) ? argv[2] : "output.txt", ios::trunc | ios::out);
    if(!(inFile.is_open() && outFile.is_open())) {
        cout<<"Error in IO, aborting"<<endl;
        return 1;
    }

    unsigned int T,N;
    inFile >> T;
    cout << "Running " << T << " Iterations" << endl;
    for(int count=0; count<T; count++) {
        inFile >> N;
        //...
        //algorithm
        //...
        outFile << "Case #" << count+1 << ": ";
        outFile << endl;
    }

    cout << "\n";
    inFile.close();
    outFile.close();
    return 0;
}
