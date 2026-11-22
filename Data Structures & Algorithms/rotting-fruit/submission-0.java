class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q = new LinkedList<>();
        int n =grid.length;
        int m = grid[0].length;
        int min = 0;
        int fresh = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i , j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int [][]dir = {{-1 , 0} , {1 , 0} , {0 , -1} ,{0 , 1}};
        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            for(int i = 0; i < size; i++){
            int curr[]=  q.poll();
            int r = curr[0];
            int c = curr[1];
            for(int d = 0; d < 4; d++){
                int nr = r + dir[d][0];
                int nc = c + dir[d][1];
                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc]==1 ){
                    grid[nr][nc]= 2;
                    fresh--;
                    q.add(new int[]{nr , nc});
                }
            }
            }
        min++;
        }
        if(fresh >0) return -1;
    
    return min;
}
}
