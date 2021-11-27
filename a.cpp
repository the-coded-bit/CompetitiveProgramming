#include <bits/stdc++.h>
using namespace std;



int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        string s;
        cin >> s;

        int countW = 1, countB = 0, ansW = 0, ansB = 0;
        for(int i = 1; i < n; i++){
            if(s[i] == 'W' && s[i] == s[i - 1]){
                countW++;
            }
            else if(s[i] == 'W'){
                countW++;
            }
            else{
                if(countW > 1){
                    ansW++;
                }
                countW = 1;
            }
        }
        cout << ansW << endl;
    }
    return 0;
}