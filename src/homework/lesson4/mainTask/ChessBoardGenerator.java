package homework.lesson4.mainTask;

/**
 * Создайте программу для раскраски шахматной доски с помощью циклов.
 *
 * Условия:
 * Создайте двумерный массив строк (String) размером 8х8.
 * С помощью циклов задайте элементам значения "W" (White) и "B" (Black) в шахматном порядке.
 * Выведите результат в консоль в следующем виде:
 */
public class ChessBoardGenerator {
    public void chessBoardGenerator(){
        String [][] board = new String[8][8];
        //Данный вариант реализовал сам. Он конечно громоздкий, но рабочий))
        for(int rows = 0; rows < board.length; rows++){
            for(int col = 0; col < board[rows].length; col++){
                if(rows%2==0) {
                    if (col % 2 == 0) {
                        board[rows][col] = "w";
                        System.out.print(board[rows][col]);
                        System.out.print(" ");
                    } else {
                        board[rows][col] = "b";
                        System.out.print(board[rows][col]);
                        System.out.print(" ");
                    }
                }else{
                    if (col % 2 == 0) {
                        board[rows][col] = "b";
                        System.out.print(board[rows][col]);
                        System.out.print(" ");
                    } else {
                        board[rows][col] = "w";
                        System.out.print(board[rows][col]);
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    //этот вариант подсмотрел в дипсике
    public void chessBoardGeneratorDeepSeek(){
        String [][] board = new String[8][8];
        for (int row = 0; row< board.length; row++){
            for(int col = 0; col<board[row].length; col++){
                if ((row+col)%2 == 0){
                    System.out.print("w");
                    System.out.print(" ");
                }
                else {
                    System.out.print("b");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
