class Practical7 {
    public static void forA(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || j == size || i == 3 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void forN(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void forM(int size) {
        for (int i = 1; i <= size; i++) {
            for (int c = 1; c <= size; c++) {
                if (c == 1 || c == size || (c + i == 6 && i <= 3) || (i == c && i <= 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void forD(int size) {
        for (int r = 1; r <= size; r++) {
            for (int c = 1; c <= size; c++) {
                if (c == 1 || (r == 1 && c <= 4) || (r == size && c <= 4) || (r >= 2 && r < size && c == size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void forE(int size) {
        for (int r = 1; r <= size; r++) {
            for (int c = 1; c <= size; c++) {
                if (r == 1 || c == 1 || r == size || (r == 3 && c <= 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void forV(int size) {
        for (int r = 1; r <= size; r++) {
            for (int c = 1; c <= 9; c++) {
                if (c == r || c + r == 10)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int size = 5;
        forN(size);
        forA(size);
        forM(size);
        forD(size);
        forE(size);
        forV(size);
    }
}

