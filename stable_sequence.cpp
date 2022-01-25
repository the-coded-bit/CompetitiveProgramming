#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    ll t;
    cin >> t;

    while(t--){
        ll n;
        cin >> n;
        vector<ll> v(n);
        
        ll maxi = INT_MIN, mini = INT_MAX;
        ll maxPos = -1;
        for(ll i = 0; i < n; i++){
            cin >> v[i];
            if(maxi <= v[i]){
                maxi = v[i];
                maxPos = i;
            }
            mini = min(mini, v[i]);
        }

        if(mini == maxi){
            cout << "0\n";
        }
        
        else{
            if(maxPos == 0){
            cout << "2\n";
            }
            else if(maxPos == n - 1){
                cout << "1\n";
            }
            else{
                cout << "3\n";
            }
        }
    }
    return 0;
}