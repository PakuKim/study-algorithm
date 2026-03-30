#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    vector<int> P1;
    int start;
    int end;
    int k;
    for (int i = 0; i < commands.size(); i++){
        P1 = {};
        start = commands[i][0];
        end = commands[i][1];
        k = commands[i][2];
        for (int j = start-1; j < end; j++){
            P1.push_back(array[j]);
        }
        sort(P1.begin(),P1.end());
        answer.push_back(P1[k-1]);
    }
    return answer;
}