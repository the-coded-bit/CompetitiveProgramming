#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n, m;
        cin >> n >> m;

        ll size = 0;
        string s ="";

        if(n > m){
            size = (3 * n) - (n - 1);
            for(int i = 0; i < size; i++){
                if(i%2) s += '1';
                else s += '0';
            }
        }
        else if(n < m){
            size = (3 * m) - (m - 1);
            for(int i = 0; i < size; i++){
                if(i%2) s += '0';
                else s += '1';
            }
        }
        else{
            size = (3 * n) - (n - 1) + 1;
            for(int i = 0; i < size; i++){
                if(i%2) s += '1';
                else s += '0';
            }
        }
        cout << size << endl;
        cout << s << endl;
    }
    return 0;
}