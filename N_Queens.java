package BackTracking;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        char[][] Board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Board[i][j]='X';
            }
        }
        System.out.println("The Board Before the Queen's Enterance : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(Board[i][j]); 
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("the Board after the Queen Enterance :");
        n_queen(Board, 0);
    }

    private static void n_queen(char[][] Board, int row) {
        int n = Board.length;
        if(row==n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(Board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(Board, row, j)) {
                Board[row][j] = 'Q';
                n_queen(Board, row + 1);
                Board[row][j] = 'X';
            }
        }
    }

    private static boolean isSafe(char[][] Board, int row, int col) {
        for (int j = 0; j < Board.length; j++) {
            if (Board[row][j] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < Board.length; i++) {
            if (Board[i][col] == 'Q') {
                return false;
            }
        }
        int i = row;
        int j = col;
        while(i>=0&&j< Board.length){
            if(Board[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
         i=row;
        j=col;
        while(i< Board.length&&j< Board.length){
            if(Board[i][j]=='Q'){
                return false;
            }
            i++;
            j++;
        }
        i=row;
        j=col;
        while(i<Board.length&&j>=0){
            if(Board[i][j]=='Q'){
                return false;
            }
            i++;
            j--;
        }
        i=row;
        j=col;
        while(i>=0&&j>=0){
            if(Board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}



