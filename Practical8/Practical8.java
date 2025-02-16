public class Practical8 {
    static void printAscending(int maxRows, int currentRow) {
        if (currentRow > maxRows) return;
        for (int i = 0; i < currentRow; i++) {
            System.out.print("*");
        }
        System.out.println();
        printAscending(maxRows, currentRow + 1);
    }
    static void printDescending(int currentRow) {
        if (currentRow < 1) return;
        for (int i = 0; i < currentRow; i++) {
            System.out.print("*");
        }
        System.out.println();
        printDescending(currentRow - 1);
    }
    static void printPyramid(int size) {
        printAscending(size, 1);
        printDescending(size);
    }
    public static void drawTree(int row, int width) {
        if (row > width) return;
        printSpaces((width - row) / 2);
        printStars(row);
        System.out.println();
        drawTree(row + 2, width);
        printSpaces((width - row) / 2);
        printStars(row);
        System.out.println();
        if (row == 1) {
            for (int j = 0; j < width; j++) {
                printSpaces((width - row) / 2);
                printSymbols(row, "+");
                System.out.println();
            }
        }
    }
    static void drawTriangle(int row, int size) {
        if (row > size + 1) return;
        printSpaces(size + 1 - row);
        printSymbols(row, "*");
        System.out.println();
        drawTriangle(row + 1, size);
        if (row <= size) {
            printSpaces(size + 1 - row);
            printSymbols(row, "/");
            System.out.println();
        }
    }
    static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
    static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
    static void printSymbols(int count, String symbol) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }

    public static void main(String[] args) {
        Practical8 generator = new Practical8();
        generator.printPyramid(3);
        generator.drawTree(1, 5);
        generator.drawTriangle(1, 3);
    }
}

