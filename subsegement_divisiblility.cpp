#include<bits/stdc++.h>
using namespace std;


int main(){
    int t;
    cin >> t;
    int a[500];
    for(int i = 0; i < 500; i++)a[i] = i + 1;

    for(int i = 1; i < 500; i+= 2){
        int temp = a[i];
        a[i] = a[i - 1];
        a[i - 1] = temp;
    }


    while(t--){
        int n;
        cin >> n;

        for(int i = 0; i < n; i++) cout << a[i] << " ";
        cout << "\n";
    }
    return 0;
}