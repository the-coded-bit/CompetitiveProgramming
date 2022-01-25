#include <bits/stdc++.h>
using namespace std;

int main(){
    vector<int> nums = {1,1,0,0,1};

    int k = 0;
    for(int i = 0; i < nums.size(); i++){
        if(nums[i] == 1) k++;
    }

    nums.insert(nums.end(), nums.begin(), nums.begin() + (k - 1));

    int i = 0, j = 0, ans = INT_MAX, a = 0;
    while(j < nums.size()){
        if(nums[j] == 0) a++;

        if(j - i + 1 < k) j++;
        else if(j - i + 1 == k){
            ans = min(ans, a);
            if(nums[i] == 0) a--;
            i++;
            j++;
        } 
    }
    cout << ans << endl;
}