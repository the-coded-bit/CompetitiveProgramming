#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        string s;
        cin >> s;
        
        int cnt = 0;
        if(n == 1){
            cout << 0 << " " << 1 << endl;
            continue;
        }
        
        int i = 1, lastVisited = -1; 
        char firstchar = s[0];
        while(i < n){
            if(firstchar == '(' && s[i] == ')'){
                cnt++;
                lastVisited = i;
                if(i + 1 < n) firstchar = s[++i];
            }
            else if(firstchar == s[i]){
                cnt++;
                lastVisited = i;
                if(i + 1 < n) firstchar = s[++i];
            }
            i++;
        }
        cout << cnt  << " " << n - lastVisited - 1<< endl;
        
    }
    return 0;
}