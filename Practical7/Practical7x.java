public class Practical7x {
    public static void main(String[] args) {
        int size = 5;
        int space = 4;
        for (int i = 1; i <= size; i++) {
            forN(i, size);
            printSpaces(space);
            forA(i, size);
            printSpaces(space);
            forM(i, size);
            printSpaces(space);
            forD(i, size);
            printSpaces(space);
            forE(i, size);
            printSpaces(space);
            forV(i, size);
            System.out.println();
        }
    }
    public static void forN(int i, int size) {
        for (int j = 1; j <= size; j++) {
            if (j == 1 || j == size || i == j) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void forA(int i, int size) {
        for (int j = 1; j <= size; j++) {
            if (i == 1 || j == size || i == 3 || j == 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void forM(int i, int size) {
        for (int c = 1; c <= size; c++) {
            if (c == 1 || c == size || (c + i == 6 && i <= 3) || (i == c && i <= 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void forD(int i, int size) {
        for (int c = 1; c <= size; c++) {
            if (c == 1 || (i == 1 && c <= 4) || (i == size && c <= 4) || (i >= 2 && i < size && c == size)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void forE(int i, int size) {
        for (int c = 1; c <= size; c++) {
            if (i == 1 || c == 1 || i == size || (i == 3 && c <= 4)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void forV(int i, int size) {
        for (int c = 1; c <= 9; c++) {
            if (c == i || c + i == 10) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void printSpaces(int count) {
        for (int s = 0; s < count; s++) {
            System.out.print(" ");
        }
    }
}
