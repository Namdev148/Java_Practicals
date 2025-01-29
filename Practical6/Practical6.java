public class Practical6 {
    static void displaypattern1(int size) {
        for (int i = 1; i <= size; i++) {
            for (int space = 0; space < size - i; space++) {
                System.out.print("  ");
            }
            for (int plus = 0; plus < 2 * i - 1; plus++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int space = 0; space < size - i; space++) {
                System.out.print("  ");
            }
            for (int plus = 0; plus < 2 * i - 1; plus++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    static void displaypattern2(int size) {
        for (int line = 1; line <= size; line++) {
            for (int space = 1; space <= size - line; space++) {
                System.out.print("  ");
            }
            for (int symbol = 1; symbol <= line * 2 - 1; symbol++) {
                if (symbol % 2 != 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int line = size - 1; line >= 1; line--) {
            for (int space = 1; space <= size - line; space++) {
                System.out.print("  ");
            }
            for (int symbol = 1; symbol <= line * 2 - 1; symbol++) {
                if (line == size - 1) {
                    if (symbol % 2 != 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (line == 2) {
                    if (symbol == 1 || symbol == 3) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (symbol % 2 != 0) {
                        System.out.print("+ ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void displaypattern3(int size) {
        for (int ln = 1; ln <= size; ln++) {
            for (int spaces = 1; spaces <= size - ln; spaces++) {
                System.out.print("  ");
            }
            for (int symbol = 1; symbol < 2 * ln; symbol++) {
                if ((ln + symbol) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }

        for (int ln = 3; ln > 0; ln--) {
            for (int spaces = size - ln; spaces > 0; spaces--) {
                System.out.print("  ");
            }
            for (int symbol = 2 * ln - 1; symbol > 0; symbol--) {
                if ((symbol + ln) % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 3;
        System.out.println("Pattern 1:");
        displaypattern1(size);

        System.out.println("\nPattern 2:");
        displaypattern2(size);

        System.out.println("\nPattern 3:");
        displaypattern3(size);
    }
}

