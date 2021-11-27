#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
		//handling inputs
		int n;
		string s;
		cin >> n;
		cin >> s;
		s = s + " ";

		//counting the number of substrings for character 'W
		int countW = 0, ansW = 0;
		for(int i = 0; i < n+1; i++){
			if(s[i] == 'W'){
				countW++;
			}
			else{
				if(countW > 0){
					ansW++;
				}
				countW = 0;
			}
		}
		
		//counting the number of substrings for character 'B'
		int countB = 0, ansB = 0;
		for(int i = 0; i < n+1; i++){
			if(s[i] == 'B'){
				countB++;
			}
			else{
				if(countB > 0){
					ansB++;
				}
				countB = 0;
			}
		}
		int mini = (ansW < ansB)?ansW : ansB;
		cout << mini << endl;
	}
	return 0;
}