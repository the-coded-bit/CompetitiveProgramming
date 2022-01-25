#include<bits/stdc++.h>
using namespace std;

vector<int> findLonely(vector<int>& nums) {
    int n = nums.size();
    sort(nums.begin(), nums.end());

    vector<int> ans;

    for(int i = 0; i < n; i++){
        if(i == 0){
            if((nums[i] + 1) == nums[i + 1] || nums[i] == nums[i + 1]) continue;
            else ans.push_back(nums[i]);
        }
        else if(i == (n - 1)){
            if((nums[i] - 1) == nums[i - 1] || nums[i] == nums[i - 1]) continue;
            else ans.push_back(nums[i]);
        }
        else{
            if(nums[i] == nums[i + 1] || nums[i] == nums[i - 1] || (nums[i] + 1) == nums[i + 1] || (nums[i] - 1) || nums[i - 1]) continue;
            else ans.push_back(nums[i]);
        }
    }
    return ans;        
}

int main(){
    int n;
    cin >> n;
    vector<int> a(n, 0);
    for(int i = 0; i < n; i++) cin >> a[i];
}