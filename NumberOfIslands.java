class Solution {
    public int numIslands(char[][] grid) {
        if (grid ==  null || grid.length == 0){
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;

        for(int r =0; r < nr; r++){
            for(int c =0; c < nc; c++){
                if (grid[r][c] == '1'){
                    num_islands++;
                    grid[r][c] = '0';   //marking as visited
                    Queue<Integer> neighbors = new LinkedL
                }
            }
        }
    }
}