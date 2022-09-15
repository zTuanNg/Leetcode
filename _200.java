package homework;

public class _200 {
    public static void main(String[] args) {

    }

    public static int numIslands(char[][] grid) {

        int count=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    dfs(visited,grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(boolean[][] visited, char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] == true || grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true;
        dfs(visited, grid, i - 1, j);
        dfs(visited, grid, i + 1, j);
        dfs(visited, grid, i, j - 1);
        dfs(visited, grid, i, j + 1);

    }


}
