#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    
    while(t--){
        cout << "entering loop" << endl;
        int n;
        cin >> n;
        
        string s;
        cin >> s;

        if(s.length() == 1){
            cout << 1 << " " << 0 << "\n";
            continue;
        }

        char firstchar = s[0];
        int i = 1, cnt = 0, cntclose = 0, cntopen = 0;
        while(i < s.length()){
            char ch = s[i];
            if(ch == ')') cntclose++;
            else cntopen++;

            if(firstchar == '(' && ch == ')'){
                cout << "this condition is true" << endl;
                
                cnt++;
                cntclose = 0, cntopen = 0;
                firstchar = i + 1 < s.length()? s[i++] : firstchar;
            }

            else if(firstchar == ch){
                if((ch == '(' && cntclose == 1 && cntopen >= 0) || (ch == ')' && cntopen == 1 && cntclose >= 0)){
                    cnt++;
                    firstchar = i + 1 < s.length()? s[i++] : firstchar;
                    cntopen = 0, cntclose = 0;
                }
            }
            i++;
        }
        cout << "value of i" << i << endl;
        cout << cnt << " " << n - i << endl;
    }
    return 0;
}