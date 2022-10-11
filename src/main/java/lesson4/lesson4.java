package lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    //постоянные
    private static int size;
    private static int winSize;

    private static final String HEADER_FIRST_SUMBOL = "*";
    private static final String SPACE = " ";

    private static final char DOT_EMPTY = '-';
    private static final char DOT_USER = 'X';
    private static final char DOT_AI = 'O';

    private static char[][] MAP = new char[size][size];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnCount = 0;



    public static void main(String[] args) {

        startGame();

    }

    public static void startGame() {

        do {
            System.out.println("Игра начинается!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
    }

    private static void init() {
        turnCount = 0;
        size = getSize();
        winSize = getWinSize();
        initMap();

    }

    private static int getWinSize() {

        if (size >= 3 && size <= 6) {
            return 3;
        } else if (size > 6 && size <= 10) {
            return 4;
        } else if (size > 10) {
            return 5;
        }
        return winSize;
    }

    private static int getSize() {
        System.out.println("Введите размер игрового поля!");
        return in.nextInt();
    }

    private static boolean isContinueGame() {
        System.out.println("Продолжить игру? y//n");
        return switch (in.next()) {
            case "y", "у", "+" -> true;
            default -> false;
        };
    }




    private static void playGame() {
        while (true) {

            humanTurn();
            printMap();
            if (checkEnd(DOT_USER)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_USER) {
                System.out.println("Ура победа человека!");
            } else  {
                System.out.println( "Победил компьютер!");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }

        return false;
    }

    private static boolean checkDraw() {
        return turnCount >= size * size;
    }

    private static boolean checkWin(char symbol) {

        int sumDiagB;
        int sumDiagS;
        sumDiagB = 0;
        sumDiagS = 0;

        for (int diag = 0; diag < size; diag++) {

            int sumRow, sumCol;
            sumRow = sumCol = 0;

            for (int i = 0; i < size; i++) {
                sumRow += (MAP[diag][i] == symbol) ? 1 : -1;
                sumCol += (MAP[i][diag] == symbol) ? 1 : -1;
                if (i == diag) {
                    sumDiagB += (MAP[diag][diag] == symbol) ? 1 : -1;
                    sumDiagS += (MAP[diag][size - 1 - diag] == symbol) ? 1 : -1;
                }
                if (sumRow >= winSize || sumCol >= winSize) return true;
                if (sumRow < 0) sumRow = 0;
                if (sumCol < 0) sumCol = 0;
            }

            if (sumDiagB >= winSize || sumDiagS >= winSize) return true;
            if (sumDiagB < 0) sumDiagB = 0;
            if (sumDiagS < 0) sumDiagS = 0;
        }

        return false;
//        if(MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
//            return true;
//        }
//        if(MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
//            return true;
//        }
//        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
//            return true;
//        }
//        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
//            return true;
//        }
//        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
//            return true;
//        }
//        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
//            return true;
//        }
//        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
//            return true;
//        }
//        if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) {
//            return true;
//        }
//        return false;
    }

    private static void aiTurn() {
        System.out.println("\nХод компютера!");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(size);

            columnNumber = random.nextInt(size);

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnCount++;
    }

    private static void humanTurn() {
        System.out.println("\nХод человека!");

        int rowNumber;
        int columnNumber;

        while (true) {

            System.out.print("Введите коррдинату X: ");
            columnNumber = in.nextInt() - 1;

            System.out.print("Введите коррдинату Y: ");
            rowNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("\nОшибка!! Ячейка с координатами %s:%s уже используется\n", rowNumber + 1, columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_USER;
        turnCount++;

    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }


    private static void  initMap() {

        MAP = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }

    }

    private static void printMap() {
        printHeader();
        printBodyMap();
    }

    private static void printBodyMap() {

        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.print(MAP[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    private static void printHeader() {
        System.out.print(HEADER_FIRST_SUMBOL + SPACE);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE);
    }

}
