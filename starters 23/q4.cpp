#include<bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        for(int i = 1; i <= n; i++){
            cout << (i ^ (i + 1)) << " ";
        }
        cout << "\n";
    }
    return 0;
}