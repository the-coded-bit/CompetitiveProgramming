#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        vector<int> a(n, 0);
        for(int i = 0; i < n; i++) cin >> a[i];

        string s;
        cin >> s;

        vector<int> like, dislike;

        for(int i = 0; i < n; i++){
            if(s[i] == '0') dislike.push_back(a[i]);
            else like.push_back(a[i]);
        }

        sort(like.begin(), like.end());
        sort(dislike.begin(), dislike.end());

        vector<int> ans(n, 0);
        map<int, int> mp;

        for(int i = 1; i <= dislike.size(); i++){
            mp[dislike[i - 1]] = i;
        }
        int j = 0;
        for(int i = dislike.size() + 1; i <= n; i++){
            mp[like[j]] = i;
            j++;
        }

        for(int i = 0; i < n; i++){
            int val = mp[a[i]];
            ans[i] = val;
        }

        for(auto i : ans) cout << i << " ";
        cout << endl;

        
    }
    return 0;
}