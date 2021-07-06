package hw4;

import java.util.Random;
import java.util.Scanner;

public class XOgame {

    static final int SIZE = 5;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победа!!!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Поражение");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x; // столбец
        int y; // строка
        do {
            System.out.println("Введите координаты: X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        System.out.println("Ход компьютера");
        int x; // столбец
        int y; // строка
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

//    public static boolean checkWin(char c) {
//        if(map[0][0] == c && map[0][1] == c && map[2][2] == c) { return true; }
//        if(map[1][0] == c && map[1][1] == c && map[1][2] == c) { return true; }
//        if(map[2][0] == c && map[2][1] == c && map[2][2] == c) { return true; }
//
//        if(map[0][0] == c && map[1][0] == c && map[2][0] == c) { return true; }
//        if(map[0][1] == c && map[1][1] == c && map[2][1] == c) { return true; }
//        if(map[0][2] == c && map[1][2] == c && map[2][2] == c) { return true; }
//
//        if(map[0][0] == c && map[1][1] == c && map[2][2] == c) { return true; }
//        if(map[0][2] == c && map[1][1] == c && map[2][0] == c) { return true; }
//            return false;
//    }

    public static boolean checkLine(int start_x, int start_y, int dx, int dy, char c) {
        for (int i = 0; i < SIZE; i++) {
            if (map[start_x + i * dx][start_y + i * dy] != c)
                return false;
        }
        return true;
    }

    public static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            if (checkLine(i, 0, 0, 1, c))
                return true;
            if (checkLine(0, i, 1, 0, c))
                return true;
        }
        if (checkLine(0, 0, 1, 1, c))
            return true;
        if (checkLine(0, SIZE - 1, 1, -1, c))
            return true;
        return false;
    }

}


