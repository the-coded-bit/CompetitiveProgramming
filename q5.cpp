#include <bits/stdc++.h>
using namespace std;

int main() {

    int arr[] = {1,2,3};
    int prod = 1;
    for(int i: arr) {
        prod = prod *i;
    }
    for(int i = 0; i < 3; i++) {
        arr[i] = prod/arr[i];
    }
    for(int i: arr) {
        cout << i << " ";
    }

    return 0;
}