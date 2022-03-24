#include <iostream>
#include<bits/stdc++.h>

using namespace std;

int main() {
	// your code goes here
    int t;
    cin >> t;

    while(t--){
        int n, x;
        cin >> n >> x;

        string s;
        std::cin >> s;

        if(x == 1){
            int res = 0;
            for(int i = 0; i < s.size(); i++){
                if(s[i] == '0') res++;
            }
            if(res < s.size()) res++;
            cout << res << "\n";
            continue;
        }

        int i = 0, j = 0, cnt = 0, ans = 0;
        bool transformed = false;
        while(j < n){
            if(s[j] == '0') cnt++;

            if(j - i + 1 < x) j++;
            else if(j - i + 1 == x){
                if(cnt == x || cnt == x - 1 && transformed == false){
                    if(cnt == x - 1) transformed = true;
                    ans++;
                }
                else if(cnt < x){
                    if(s[i] == '0') cnt--;
                    j++;
                    i++;
                    continue;
                }
                j++;
                i = j;
                cnt = 0;
            }
        }
        cout << ans << "\n";
    }
	return 0;
}
