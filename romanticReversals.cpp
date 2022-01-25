#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main(){

    ll t;
    cin >> t;
    while(t--){
        ll n, k;
        cin >> n >> k;
        string s;
        cin >> s;

        if(k == 1){
            cout << s << "\n";
            continue;
        }

        vector<char> ans(n, '$');
        ll i = k, a = 0, j = k%2 == 0? 1 : 2; 


        while(i > 0){
            ans[i - 1] = s[a];
            a++;
            i -= 2;
        }
        while(j < k){
            ans[j - 1] = s[a];
            a++;
            j += 2;
        }

        for(ll i = k; i < n; i++){
            ans[i] = s[a];
            a++;
        }

        for(ll i = 0; i < n; i++) cout << ans[i];
        cout << endl;

    }

    return 0;
}