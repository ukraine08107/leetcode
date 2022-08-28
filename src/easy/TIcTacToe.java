package easy;

import java.util.Arrays;

public class TIcTacToe {
    public static void main(String[] args) {
        int[][] arr = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        int[][] arr1 = {{0, 0}, {2, 0}, {1, 1}, {2, 1},};
        int[][] arr2 = {{1,2},{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        int[][] arr3 = {{1,1},{0,0},{0,1},{2,1},{2,0},{0,2},{1,2},{1,0},{2,2}};




//        System.out.println(ticTacToe1(arr));
//        System.out.println(ticTacToe1(arr1));
//        System.out.println(ticTacToe1(arr2));
        System.out.println(ticTacToe1(arr3));
    }

//
//    [][][]
//    [][][]
//    [][][]
//
//
//    00 01 02
//    10 11 12
//    20 21 22


 

    public static String ticTacToe1(int[][] moves){
        int[] arr1 = {0,0,0,0,0,0};
        int[] arr2 = {0,0,0,0,0,0};
        int arr1Counter = 0;
        int arr2Counter = 0;
  //                  x     y
        for (int i = 0; i <moves.length; i++) {
            for (int j = 0; j <moves[0].length ; j++) {
                if(i%2 == 0){
                    if (j==0){
                        if (arr1[j+moves[i][j]]==0 && i!= 8){
                            arr1Counter++;
                        }
                        arr1[j+moves[i][j]]++;
                        if (arr1[j+moves[i][j]]==3 || arr1Counter==6){
                            return  "X win";
                        }
                    } else {
                        if (arr1[j+moves[i][j]+2]==0 && i != 8) {
                            arr1Counter++;
                        }
                        arr1[j+moves[i][j]+2]++;
                        if (arr1[j+moves[i][j]]==3 || arr1Counter ==6){
                                return "X win";
                            }
                        }
                }else {
                    if (j==0){
                        if (arr2[j+moves[i][j]]==0){
                            arr2Counter++;
                        }
                        arr2[j+moves[i][j]]++;
                        if (arr2[j+moves[i][j]]==3 || arr2Counter==6){
                            return "O win";
                        }
                    } else {
                        if (arr2[j+moves[i][j]+2]==0){
                            arr2Counter++;
                        }
                        arr2[j+moves[i][j]+2]++;
                        if (arr2[j+moves[i][j]]==3 || arr2Counter==6){
                           return "O win";
                        }
                    }
                }
            }

        }
if (moves.length < 9){
    return "waiting";
}
return "draw";
    }


    public static String tictactoe(int[][] moves) {
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] arr2 = {0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[0].length; j++) {
                if (i % 2 == 0) {
                    if (j == 0) {
                        arr1[j + moves[i][j]]++;
                    } else {
                        arr1[j + moves[i][j] + 2]++;
                    }
                } else {
                    if (j == 0) {
                        arr2[j + moves[i][j]]++;
                    } else {
                        arr2[j + 2 + moves[i][j]]++;
                    }
                }

            }
            if((moves[i][0]==0 &&moves[i][1]==0) ||
                    (moves[i][0]==1 &&moves[i][1]==1) ||
                    ( moves[i][0]==2 &&moves[i][1]==2)){
                arr1[6]++;
            }
            if((moves[i][0]==2 &&moves[i][1]==0) ||
                    (moves[i][0]==1 &&moves[i][1]==1) ||
                    (moves[i][0]==0 &&moves[i][1]==2)){
                arr2[6]++;
            }
        }
        return "sts";

    }
}





