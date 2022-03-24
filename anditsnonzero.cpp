#include<bits/stdc++.h>
using namespace std;

int countUnsetBitAtPos(int left, int right, int pos){
    int cnt = 0;
    int num = (int)pow(2, pos);
    while(left <= right){
        if(!(num & left)) cnt++;
        left++;
    }
    return cnt;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int left, right;
        cin >> left >> right;

        int ans =  INT_MAX;
        for(int i = 0; i < 32; i++){
            int val = countUnsetBitAtPos(left, right, i);
            ans = min(ans, val);
        }
        cout << ans << endl;
    }
    return 0;
}