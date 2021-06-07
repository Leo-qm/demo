package Array;

import java.util.Scanner;
//井字棋
public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean gotResut = false;
        int numOfX = 0;
        int numOfO = 0;

        // 读入矩阵
        for ( int i = 0;i<board.length; i++){
            for (int j = 0; j<board[i].length; j++){
                board[i][j] = in.nextInt();
                System.out.println(i+" "+j);
            }
        }
        // 检查行
        for ( int i = 0;i<board.length; i++){
            for (int j = 0; j<board[i].length; j++){
                if ( board[i][j] == 1 ){
                    numOfX++;
                }
                else {
                    numOfO++;
                }
            }
            if ( numOfX == SIZE || numOfO == SIZE){
                gotResut = true;
                break;
            }
        }
        // 检查列
        // 检查对角线
        if ( !gotResut ){
            numOfX = 0;
            numOfO = 0;
            for ( int i = 0; i<SIZE; i++ ){
                if ( board[i][SIZE-i-1] == 1 ){
                    numOfX ++;
                }
                else {
                    numOfO ++;
                }
            }
            if ( numOfX == SIZE || numOfO == SIZE){
                gotResut = true;
            }
        }
        if ( gotResut){
            if (numOfX == SIZE){
                System.out.println("x赢了");
            }
            else {
                System.out.println("o赢了");
            }
        }
    }
}
