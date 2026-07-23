class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;

        int []pse=new int[n];
        int []nse=new int[n];
        Stack<Integer>st1=new Stack<>();
        for (int i=0;i<n;i++){
            while(!st1.isEmpty()&&heights[st1.peek()]>=heights[i]){
                    st1.pop();
            }
            if(st1.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st1.peek();
            }
            st1.push(i);
        }
        Stack<Integer>st=new Stack<>();
        for (int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                    st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,(nse[i]-pse[i]-1)*heights[i]);
        }
        return maxi;

        
    }
}
