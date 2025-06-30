
//https://leetcode.com/problems/unique-paths-ii/

//BRUTEFORCE -RECURSION
/*class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        int rows=obstacleGrid.length;
        int cols=obstacleGrid[0].length;
        int res=recursion(0,0,rows,cols,obstacleGrid);
        return res;
    }
    public int recursion(int r,int c,int rows,int cols,int[][] obstacleGrid)
    {
         if(r>=rows || c>=cols) return 0;
         else if(obstacleGrid[r][c]==1) return 0;
        else if(r==rows-1 && c==cols-1) return 1;
        else
        {
            int x=recursion(r+1,c,rows,cols,obstacleGrid);
            int y=recursion(r,c+1,rows,cols,obstacleGrid);
            return x+y;
        }
    }
}*/
//MEMOIZATION
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        int rows=obstacleGrid.length;
        int cols=obstacleGrid[0].length;
        int[][] dp=new int[rows][cols];
        for(int i=0;i<rows;i++)
        Arrays.fill(dp[i],-1);
        int res=recursion(0,0,rows,cols,obstacleGrid,dp);
        return res;
    }
    public int recursion(int r,int c,int rows,int cols,int[][] obstacleGrid,int[][] dp)
    {
         if(r>=rows || c>=cols) return 0;
         else if(obstacleGrid[r][c]==1) return 0;
        else if(r==rows-1 && c==cols-1) return 1;
        else if(dp[r][c]!=-1) return dp[r][c];
        else
        {
            int x=recursion(r+1,c,rows,cols,obstacleGrid,dp);
            int y=recursion(r,c+1,rows,cols,obstacleGrid,dp);
            dp[r][c]=x+y;
            return dp[r][c];
                   
                    }

    }
}
