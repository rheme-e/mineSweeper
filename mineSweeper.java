package mineSweeper;
import java.util.Scanner;
import java.util.Arrays;

public class mineSweeper {

    int row;
    int col;
    String[][] mine = new String[row][col];


    mineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
    }





    String[][] run() {
        String[][] mine = new String[row][col];
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                mine[m][n] = " - ";
            }
        }

        for (int a = 0; a < (row * col / 4); a++) {
            int rownumber = (int) (Math.random() * row);
            int colnumber = (int) (Math.random() * col);
            if (mine[rownumber][colnumber] == (" * ")) {
                a--;
            } else {
                mine[rownumber][colnumber] = " * ";
            }
        }
        /*
        System.out.println("Cevap Anahtarı eheh");
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
                System.out.print(mine[x][y]);
            }
            System.out.println();

        }

        */
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        for (int b = 0; b < row; b++) {
            for (int c = 0; c < col; c++) {
                if (b != 0 && c != 0 && b != row - 1 && c != col - 1) {
                    if (mine[b][c] != (" * ")) {
                        int mod = 0;
                        for (int i = b - 1; i < b + 2; i++) {
                            for (int j = c - 1; j < c + 2; j++) {
                                if (i == b && j == c) {
                                } else {
                                    if (mine[i][j] == " * ") {
                                        mod++;
                                        String strMod = Integer.toString(mod);
                                        mine[b][c] = " " + strMod + " ";
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (b == 0) {
                        if (c != 0 && c != col - 1) {
                            if (mine[b][c] != (" * ")) {
                                int mod2 = 0;
                                for (int i = b; i < b + 2; i++) {
                                    for (int j = c - 1; j < c + 2; j++) {
                                        if (i == b && j == c) {
                                        } else {
                                            if (mine[i][j] == " * ") {
                                                mod2++;
                                                String strMod = Integer.toString(mod2);
                                                mine[b][c] = " " + strMod + " ";
                                            }
                                        }

                                    }
                                }
                            }
                        } else if (c == 0) {
                            if (mine[b][c] != (" * ")) {
                                int mod3 = 0;
                                for (int i = b; i < b + 2; i++) {
                                    for (int j = c; j < c + 2; j++) {
                                        if (i == 0 && j == 0) {
                                        } else {
                                            if (i == b && j == c) {
                                            } else {
                                                if (mine[i][j] == " * ") {
                                                    mod3++;
                                                    String strMod = Integer.toString(mod3);
                                                    mine[b][c] = " " + strMod + " ";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (c == col - 1) {
                            if (mine[b][c] != (" * ")) {
                                int mod3 = 0;
                                for (int i = b; i < b + 2; i++) {
                                    for (int j = c - 1; j < c + 1; j++) {
                                        if (i == 0 && j == col - 1) {
                                        } else {
                                            if (i == b && j == c) {
                                            } else {
                                                if (mine[i][j] == " * ") {
                                                    mod3++;
                                                    String strMod = Integer.toString(mod3);
                                                    mine[b][c] = " " + strMod + " ";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                    if (b == row - 1) {
                        if (c != 0 && c != col - 1) {
                            if (mine[b][c] != (" * ")) {
                                int mod4 = 0;
                                for (int i = b - 1; i < b + 1; i++) {
                                    for (int j = c - 1; j < c + 2; j++) {
                                        if (i == b && j == c) {
                                        } else {
                                            if (mine[i][j] == " * ") {
                                                mod4++;
                                                String strMod = Integer.toString(mod4);
                                                mine[b][c] = " " + strMod + " ";
                                            }
                                        }

                                    }
                                }
                            }
                        } else if (c == 0) {
                            if (mine[b][c] != (" * ")) {
                                int mod5 = 0;
                                for (int i = b - 1; i < b + 1; i++) {
                                    for (int j = c; j < c + 1; j++) {
                                        if (i == row - 1 && j == 0) {
                                        } else {
                                            if (i == b && j == c) {
                                            } else {
                                                if (mine[i][j] == " * ") {
                                                    mod5++;
                                                    String strMod = Integer.toString(mod5);
                                                    mine[b][c] = " " + strMod + " ";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (c == col - 1) {
                            if (mine[b][c] != (" * ")) {
                                int mod6 = 0;
                                for (int i = b - 1; i < b + 1; i++) {
                                    for (int j = c - 1; j < c + 1; j++) {
                                        if (i == row - 1 && j == col - 1) {
                                        } else {
                                            if (i == b && j == c) {
                                            } else {
                                                if (mine[i][j] == " * ") {
                                                    mod6++;
                                                    String strMod = Integer.toString(mod6);
                                                    mine[b][c] = " " + strMod + " ";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                    if (c == 0) {
                        if (b != 0 && b != row - 1) {
                            if (mine[b][c] != (" * ")) {
                                int mod7 = 0;
                                for (int i = b - 1; i < b + 2; i++) {
                                    for (int j = c; j < c + 2; j++) {
                                        if (i == b && j == c) {
                                        } else {
                                            if (mine[i][j] == " * ") {
                                                mod7++;
                                                String strMod = Integer.toString(mod7);
                                                mine[b][c] = " " + strMod + " ";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (c == col - 1) {
                        if (b != 0 && b != row - 1) {
                            if (mine[b][c] != (" * ")) {
                                int mod8 = 0;
                                for (int i = b - 1; i < b + 2; i++) {
                                    for (int j = c - 1; j < c + 1; j++) {
                                        if (i == b && j == c) {
                                        } else {
                                            if (mine[i][j] == " * ") {
                                                mod8++;
                                                String strMod = Integer.toString(mod8);
                                                mine[b][c] = " " + strMod + " ";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }


                }
            }
        }

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
                if(mine[x][y]==" - "){
                    mine[x][y]=" 0 ";
                }
            }
        }

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
            }
        }

        String[][] board=new String[row][col];
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                board[m][n] = " - ";
                System.out.print(board[m][n]);
            }
            System.out.println();
        }

        Scanner inp=new Scanner(System.in);

        int ex=(row*col-(row*col/4));
        while(ex>0){
            System.out.println("Satır numarası giriniz:");
            int satir= inp.nextInt();
            System.out.println("Sütun numarası giriniz:");
            int sutun= inp.nextInt();
            if(satir>=row || sutun>=col){
                System.out.println("Yanlış satır ya da sütun numarası girdiniz!!");

            }else{
                board[satir][sutun]=mine[satir][sutun];
                for (int x = 0; x < row; x++) {
                    for (int y = 0; y < col; y++) {
                        System.out.print(board[x][y]);
                    }
                    System.out.println();

                }
                ex--;
                if(ex==0){
                    System.out.println("Tebrikler Kazandınız!");
                }


                if(board[satir][sutun]==" * "){
                    System.out.println("Game over!");
                    ex=0;
                }
            }

        }




        return mine;
    }


}
