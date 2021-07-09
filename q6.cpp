#include<bits/stdc++.h>
using namespace std;

//this is the question from coding ninjas contest took place in JUET

int main()
{
    //Write your code here
    int k;
    cin >> k;
    
    vector<int> price(k+1,0);
    price[0] = 0;
    
    for(int i = 1; i <= k; i++){
        int p; 
        cin >> p; 
        price[i] = p;
    }
    
    int menu_price;
    cin >> menu_price;
    
    vector<int> menu;
    for(int i = 0; i < 4; i++) {
        int p;
        cin >> p;
        menu.push_back(p);
    }
    
    
    int tray_size; 
    cin >> tray_size;

    vector<int> tray_items(tray_size);
    for(int i = 0; i< tray_size; i++) {
        int p; 
        cin >> p;
        tray_items[i] = p;
    }
    
    
    
    unsigned long res = 0, counter = 0;
    
    
    for(int i = 0; i < tray_size; i++) {
        auto search = find(menu.begin(),menu.end(),tray_items[i]);
        if(search != menu.end()) {
              counter ++;
              replace(menu.begin(),search+1,tray_items[i],-1);
        }
        else {
              res = res + price[tray_items[i]];
        }
    }
   
    if(counter)
    cout << res+menu_price;
    else 
        cout << res << endl;     
    return 0;
}