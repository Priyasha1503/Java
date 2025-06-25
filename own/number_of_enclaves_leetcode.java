//https://leetcode.com/problems/number-of-enclaves/

class Solution {
    public int numEnclaves(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int [][] vis = new int [rows][cols];
        int total_count=0;
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                if(grid[r][c]==1 && vis[r][c]==0)
                {
                    List<Integer> res = Arrays.asList(0,0);
                    List<Integer> list=dfs(r,c,vis,grid,res);
                    int bound=list.get(0);
                    int count=list.get(1);
                    if(bound!=1)
                    total_count+=count;
                }

            }
        }
        return total_count;
    }
    public List<Integer> dfs(int r,int c,int[][] vis,int[][] grid,List<Integer> res)
    {
        if(r>=0 && c>=0 && c<grid[0].length && r<grid.length && grid[r][c]==1 && vis[r][c]==0)
        {
            vis[r][c]=1;
           // count++;
           //CHECK THE SET FUNCTION ONCE..
           //I have used an arraylist res here for storing bound and count,because if I use primitive datatype count and bound seperately,I couldnt update it and as well as I should be returning both of them =..so, we could use arraylist or array or some datastructure suitable...
           res.set(1,res.get(1)+1);//instead of count
            //Boundary condition
            if(r==0 || c==0||r==grid.length-1||c==grid[0].length-1)
            {
                //bound=1;
                res.set(0,1);//instead of bound

            }
            dfs(r+1,c,vis,grid,res);
            dfs(r,c+1,vis,grid,res);
            dfs(r-1,c,vis,grid,res);
            dfs(r,c-1,vis,grid,res);
           }
           return res;
              }
              
}
