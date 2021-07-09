#include <bits/stdc++.h>
using namespace std;

//this leetcode two sums question based on array

int main() {

    vector<int> v = {2,7,11,9,5,4};
    int target = 25;
    int start_idx = 0, end_idx = 1, sum = v[start_idx];
    for(int i = 0; i < v.size(); i++) {
        if(sum == target){
             end_idx = i;
             break;
        }
        if(sum > target) {
            sum = sum - v[start_idx];
            start_idx++; 
            end_idx = i;
            i--;
        }    
        else
            sum = sum + v[i+1];
    } 

    cout << start_idx<< " " << end_idx;


    return 0;
}