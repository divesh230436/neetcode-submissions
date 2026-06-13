class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;int e=0;
        
        for(int pile:piles){
            
            e=Math.max(e,pile);
        }
        int ans=-1;
        while(s<=e){

            int k=s+(e-s)/2;
            int time=0;
            for(int i=0;i<piles.length;i++){
                if(k>piles[i]){
                    time+=1;
                }
                else if(piles[i]%k==0){
                    time+=piles[i]/k;
                }
                else{
                    time+=piles[i]/k+1;
                }

            }
            if(time>h){
                s=k+1;
            }
            else{
                ans=k;
                e=k-1;
            }
            
        }
        return ans;
    }
    
}
