#include<bits/stdc++.h>
using namespace std;

int main(){
    string s, pattern;
    cin >> s >> pattern;
    int n = s.size();
    int k = pattern.size();

    int i = 0, j = 0, ans = 0;
    map<char, int> mp;

    for(int x = 0; x < k;  x++) mp[pattern[x]]++;
    int count = mp.size();

    while(j < n){
        // cout << "loop is running" << endl;
        if(mp.find(s[j]) != mp.end()){
            mp[s[j]]--;
            if(mp[s[j]] == 0) count--;
        }

        if(j - i + 1 < k) j++;

        else if(j - i + 1 == k){

            if(count == 0) ans++;

            if(mp.find(s[i]) != mp.end()){
               mp[s[i]]++;
               if(mp[s[i]] == 1) count++;
            }
            i++;
            j++;
        }
    }

    cout << ans;

    return 0;
}