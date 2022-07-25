#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main(){
    ll t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        char c;
        cin >> c;
        string s;
        cin >> s;

        bool allc = true;
        for(char i : s){
            if(i != c){
                allc = false;
                break;
            }
        }
        if(allc){
            cout << "0\n";
            continue;
        }

        ll lastpos = -1;
        for(ll i = n - 1; i >= 0; i--){
            if(s[i] == c){
                lastpos = i;
                break;
            }
        }
        lastpos++;
        if(lastpos <= n/2){
            cout << "2\n";
            cout << n - 1 << " " << n << endl;
        }
        else{
            cout << "1\n" << lastpos << endl;
        }
        
    }
    return 0;
}