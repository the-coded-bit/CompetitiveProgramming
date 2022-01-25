#include<bits/stdc++.h>
using namespace std;

vector<int> rearrangeArray(vector<int>& nums) {
        int size = nums.size();
        vector<int> positives, negatives;
        for(int i = 0; i < size; i++){
            if(nums[i] > 0) positives.push_back(nums[i]);
            else negatives.push_back(nums[i]);
        }
        vector<int> ans;
        for(int i = 0; i < positives.size(); i++){
            ans.push_back(positives[i]);
            ans.push_back(negatives[i]);
        }
        return ans;

}

int main(){

    return 0;
}