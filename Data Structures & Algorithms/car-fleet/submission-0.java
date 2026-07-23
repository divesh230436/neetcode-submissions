class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double  []time= new double [n];
        HashMap<Integer,Double> mp=new HashMap<>();
        for(int  i=0 ;i<n;i++){
            
            time[i]= (double)(target-position[i])/speed[i];
            position[i]=target-position[i];
            mp.put(position[i],time[i]);
        }
        Arrays.sort(position);

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()||mp.get(st.peek())<mp.get(position[i])){
                st.push(position[i]);
            }
        }
        return st.size();


        
    }
}
