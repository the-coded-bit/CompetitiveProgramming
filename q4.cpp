// this is quetion 1 from coding ninjas guided path dsa array 
// the question is about sum of an infinite array 
// this question is done using prefix sum array concept


#include <bits/stdc++.h>
using namespace std;

int main() {
    vector<int> v = {13288, 59470, 76228, 76097, 7207, 23723, 90900, 92571, 84929, 69554, 64330, 98202, 23297, 8406, 22442, 10585, 78245, 72156, 21483, 27979, 32061, 27487, 83545, 5010, 61999, 1006, 23924, 17384, 54646, 36076, 49968, 86073, 54335, 66160, 22932, 58311, 47498, 35107, 29403, 4165, 96879, 34756, 19605, 12733, 58198, 38279, 16839, 31882, 22430, 32145, 47943, 82526, 55159, 15678, 99873, 27582, 3368, 97596, 61045, 95649, 70665, 73389, 44566, 53364, 67626, 4329, 51948, 71992, 82539, 67866, 87443, 42083, 77410, 29821, 99002, 26139, 83992, 53320, 38981, 74142, 32844 ,66974, 80556, 96253, 92110, 69949, 68057, 41276, 55781, 72945, 48974, 39796, 58154, 81502, 73149, 34290, 77387, 81466, 27054, 15317, 23401 ,7599, 75132};
    vector<vector<long long>>  queries = {{6503, 7858},
{3905, 67142},
{3386, 41788},
{1652, 34587},
{6647, 77134},
{8484, 92830},
{474 ,11991},
{9271, 12257},
{2880, 93275},
{9541, 17578}};

    vector<int> prefix_sum_array;
    int sum = 0;
    prefix_sum_array.push_back(0);
    for(int i = 0; i < v.size(); i++) {
        sum = sum + v[i];
        prefix_sum_array.push_back(sum);
    }
    cout << prefix_sum_array[prefix_sum_array.size()-1] << endl;

    int M = 1e9+7;
    int i = 0; 
    while (i < queries.size())
    {
        /* code */
        long long l = queries[i][0] - 1;
        long long r = queries[i][1];
        long long quotientR = r/v.size();
        long long remR = r%v.size();
        long long quotientL = l/v.size();
        long long remL = l%v.size();
        long long sum_final = ((((quotientR%M) * (prefix_sum_array[prefix_sum_array.size() - 1]%M)%M) + prefix_sum_array[remR]%M)%M) 
                                - ((((quotientL%M) * (prefix_sum_array[prefix_sum_array.size() - 1]%M)%M) + prefix_sum_array[remL]%M)%M) ;

        cout << sum_final << " ";    
        i++;                     
    }


    return 0;
}