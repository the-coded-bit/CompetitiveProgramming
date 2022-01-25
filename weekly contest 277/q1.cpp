#include<bits/stdc++.h>
using namespace std;

int countElements(vector<int>& nums) {
        if(nums.size() == 1 || nums.size() == 2) return 0;
        else{
            sort(nums.begin(), nums.end());
            int small = nums[0], large = nums[nums.size() - 1];
            if(small == large) return 0;
            else{
                int freq_small = 0, freq_large = 0;
                for(int i = 0; i < nums.size(); i++){
                    if(nums[i] == small) freq_small++;
                    else if(nums[i] == large) freq_large++;
                }
                return nums.size() - freq_large - freq_small;
            }
        }
}

int main(){
    int n;
    cin >> n;
    vector<int> a(n, 0);
    for(int i = 0; i < n; i++) cin >> a[i];
    cout << countElements(a);

}