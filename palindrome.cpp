#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;

    while(t--){
        int n;
        cin >> n;
        if(n == 1) cout << "A\n";
        else if(n == 2) cout << "AB\n";
        else{
            int q = n / 3;
            int r = n % 3;
            int a = 0;
            while(a != n){
                if(a % 3 == 0) cout << "A";
                else if(a % 3 == 1) cout << "B";
                else cout << "C";
                a++;
            }
            cout << endl;
        }
    }
    return 0;
}