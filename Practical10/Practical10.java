public class Practical10 {

    public static void main(String[] args) {

        if (args.length == 0) {

            System.out.println("Please provide grid size as an argument.");

            return;

        }

        

        int size = Integer.parseInt(args[0]);

        gridBox(size);

    }



    public static void gridBox(int size) {

        int[][] ans = sudokuAnswerGenerator(size);

        int[][] ansgen = questionGenerator(ans, size);



        for (int row = 0; row < size * 2 + 1; row++) {

            for (int col = 0; col < size; col++) {

                if (row % 2 == 0) {

                    System.out.print(" ---- ");

                } else {

                    if (col == 0) System.out.print("|");

                    int value = ansgen[row / 2][col];

                    if (value == 0) {

                        System.out.print("     |");

                    } else {

                        System.out.printf("  %d  |", value);

                    }

                }

            }

            System.out.println();

        }

    }



    public static int[][] sudokuAnswerGenerator(int size) {

        int[][] ansBox = new int[size][size];

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                ansBox[row][col] = (row + col) % size + 1;

            }

        }

        return ansBox;

    }



    public static int[][] questionGenerator(int[][] arr, int size) {

        int[][] ans = copyArray(arr);

        int[][] que = setZero(ans);

        return que;

    }



    public static int[][] setZero(int[][] array) {

        int size = array.length;

        int totalElements = size * size;

        int elementsToZero = totalElements / 3;



        long seed = System.nanoTime(); 


        while (elementsToZero > 0) {
            int i = (int) ((seed >> 3) % size);
            int j = (int) ((seed >> 5) % size);
            if (i < 0) i += size; 
            if (j < 0) j += size;
            if (array[i][j] != 0) {

                array[i][j] = 0;

                elementsToZero--;

            }

            seed = seed * 1103515245 + 12345;

        }

        return array;

    }

    public static int[][] copyArray(int[][] source) {
        int size = source.length;
        int[][] copy = new int[size][size];
        for (int i = 0; i < size; i++) {
            System.arraycopy(source[i], 0, copy[i], 0, size);

        }
        return copy;

    }

}

