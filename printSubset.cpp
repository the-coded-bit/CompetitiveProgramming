#include <bits/stdc++.h>

using namespace std;
//this is the program to print all subsets of an array
int main(){
    vector<int> nums = {1,2,3};
    int limit = (int)pow(2,nums.size());
    
    for(int i = 0; i < limit; i++) {
        string set = "";
        int a = i;
        for(int j = nums.size()-1; j >= 0; j--) {
            int r = a % 2;
            a = a/2;
            if(r)
                set = std::to_string(nums[j])+" " + set;
            else
                set = " - " + set;    
        }
        cout << set << "\n";
    }

    return 0;
}