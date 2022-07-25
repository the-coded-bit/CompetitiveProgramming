#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;

    vector<int> v(n + 1, 0);
    for(int i = 1; i <= n; i++) v[i] = i;

    for(int i = 2; i*i < n; i++){
        if(v[i] == i){
            for(int j = i * i; j < n + 1; j += i){
                if(v[j] == j) v[j] = i;
            }
        }   
    }

    vector<int> ans;
    while(n > 1){
        ans.push_back(v[n]);
        n = n/v[n];
    }

    for(auto i : ans) cout << i << " ";
    return 0;
}