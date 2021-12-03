#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
    ll t;
    cin >> t;
    
    while (t--)
    {
        /* code */
        ll n;
        cin >> n;
        string s;
        cin >> s;

        // calculating the frequency of 0s
        ll cnt0 = 0;
        for(ll i = 0; i < n; i++){
            if(s[i] == '0')
                cnt0++;   
        }

        ll cnt = 0, cnt1 = 0;
        for(ll i = 0; i < cnt0; i++){
            if(s[i] == '0') cnt++;
            else cnt1++;
        }
        if(cnt == cnt0){
            cout << 0 << endl;
            continue;
        }
        else{
            cout << 1 << endl;
        }

        cout << 2 * cnt1 << " ";

        for(ll i = 0; i < n; i++){
            if(i < cnt0 && s[i] == '1'){
                cout << i + 1 << " ";
            }
            else if(i >= cnt0 && s[i] == '0'){
                cout << i + 1 << " ";
            }
        }
        cout << "\n";
    }
    
    return 0;
}