class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[] time = new double[n];
        for(int i = 0; i < n; i++){
            time[i]  = (double)(target - position[i]) / speed[i];
        }
        Integer [] order = new Integer[n];
        for(int i = 0; i< n; i++){
            order[i] = i;
        }
        Stack<Double>st = new Stack<>();
        Arrays.sort(order , (a, b) -> position[b] - position[a]);
        for(int i = 0; i < n; i++){
            double t = time[order[i]];
            if(st.isEmpty() ||  t > st.peek()){
                st.push(t);
            }
        }
        return st.size();
    }
}
