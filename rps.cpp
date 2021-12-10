#include<bits/stdc++.h>
using namespace std;

#define ll long long

char compare(char a, char b){
    if(a == b){
        return a;
    }

    if((a == 'R' && b == 'S') || (a == 'S' && b == 'R')){
        return 'R';
    }
    else if((a == 'S' && b == 'P') || (a == 'P' && b == 'S')){
        return 'S';
    }
    else if((a == 'R' && b == 'P') || (a == 'P' && b == 'R')){
        return 'P';
    }
}

int main(){

    ios::sync_with_stdio(0);
    cin.tie(NULL);

    ll t;
    cin >> t;
    while (t--)
    {
        /* code */
        ll n;
        cin >> n;

        string s;
        cin >> s;
        
        //edge case if length of string is 1
        if(n == 1){
            cout << s << "\n";
            continue;
        }

        char ans = compare(s[0], s[1]);
        for(ll i = 2; i < n; i++){
            ans = compare(s[i], ans);
        }
        
        cout << ans << "\n";
        
        for(ll i = 0; i < n - 1; i++){
            cout << compare(s[i], ans);
        }
        cout << ans << "\n";
    }
    
    return 0;
}