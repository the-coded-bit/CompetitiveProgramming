#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
	    int n, k, x;
	    cin >> n >> k >> x;
	    if(k < x){
	        cout << "-1\n";
	        continue;
	    }
	    for(int i = 0; i < n; i++){
	        if(i % k == x) cout << i % k + 1 << " ";
	        else{
	            cout << i % k << " ";
	        }
	    }
	    cout << "\n";
	}
	return 0;
}
