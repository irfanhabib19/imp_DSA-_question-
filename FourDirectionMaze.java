package BackTracking;

public class FourDirectionMaze {
    public  static void print_path(int sr,int sc,int er,int ec,String ans,boolean[][] isvisted){
         if(sc<0||sr<0){
             return;
         }
         if(sc>ec||sr>er){
             return;
         }
        if (isvisted[sr][sc]==true){
            return;
        }
         if(sc==ec&&sr==er){
             System.out.println(ans+" ");
         }
         isvisted[sr][sc]=true;
         // right
        print_path(sr,sc+1,er,ec,ans+"R",isvisted);
         //left
        print_path(sr,sc-1,er,ec,ans+"L",isvisted);
        //up
        print_path(sr-1,sc,er,ec,ans+"U",isvisted);
        // down
        print_path(sr+1,sc,er,ec,ans+"D",isvisted);
        // backtracking
        isvisted[sr][sc]=false;
    }
    public static void main(String[] args) {
        int row=3;
        int col=3;
        boolean [][] isvisited=new boolean [row][col];
      print_path(0,0,row-1,col-1," ",isvisited);
    }
}