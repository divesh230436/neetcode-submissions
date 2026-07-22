class Solution {
public:
    void call(vector<int>& nums , int i, vector<int>& temp ,vector<vector<int>>&ans){
        if(i== nums.size()){
            ans.push_back(temp) ;
            return ;
        }
        temp.push_back(nums[i]) ; 
        call(nums , i+1 , temp , ans) ;
        temp.pop_back() ;
        call(nums, i+1 , temp  , ans);
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size() ; 
        vector<vector<int>> ans ; 
        vector<int> temp ; 
        call(nums , 0 , temp , ans) ; 
        return ans ;
    }
};
