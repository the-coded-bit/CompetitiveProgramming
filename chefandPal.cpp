#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        if(n%2 == 0){
            string s;
            for(ll i = 0; i < n; i++){
                if(i%2 == 0){
                    s.push_back('1');
                }
                else{
                    s.push_back('0');
                }
            }
            cout << s << "\n";
        }
        else{
            cout << "-1\n";
        }
    }
}