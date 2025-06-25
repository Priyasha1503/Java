
//https://leetcode.com/problems/number-of-islands/
//DFS
class Solution {
    public int numIslands(char[][] grid) {
        //we couldnt use hasset here like we did in python for visited because hashset dient support the list datastructure in it...
        int rows=grid.length;
        int cols=grid[0].length;
       int[][] visited=new int [rows][cols];
       int count=0;
       for(int r=0;r<rows;r++)
       {
        for(int c=0;c<cols;c++)
        {
            if(grid[r][c]=='1' && visited[r][c]==0){
            count++;
            dfs(r,c,visited,grid);
            }

        }
       }
       return count;
    }
       
    public void dfs(int r,int c,int[][] vis,char[][] grid)
    {
        if(r>=0 &&c>=0&&r<grid.length && c<grid[0].length && vis[r][c]==0 && grid[r][c]=='1')
        {
            vis[r][c]=1;
            dfs(r+1,c,vis,grid);
            dfs(r,c+1,vis,grid);
            dfs(r-1,c,vis,grid);//up
            dfs(r,c-1,vis,grid);//left

        }
        
    }
}
