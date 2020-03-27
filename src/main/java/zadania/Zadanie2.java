package zadania;

public class Zadanie2 {

    public static int metoda_1(int x, int y) {

        if (x == 0 && y == 0) { // Return 0 if x = 0 and y = 0
            return 0;
        } else if (x == 1 && y == 0) {
            return 1;
        } else if (x == 2 && y == 0) {
            return 1;
        } else if (x == 3 && y == 0) {
            return 1;
        } else if (x == 4 && y == 0) {
            return 1;
        } else if (x == 5 && y == 0) {
            return 1;
        } else if (x == 6 && y == 0) {
            return 1;
        } else if (x == 7 && y == 0) {
            return 1;
        } else if (x == 8 && y == 0) {
            return 1;
        } else if (x == 9 && y == 0) {
            return 1;
        } else if (x == 10 && y == 0) {
            return 1;
        }

        int temp = x;
        x = y;
        y = temp;

        if (x == 0 && y == 1) {
            return 1;
        } else if (x == 0 && y == 2) {
            return 2;
        } else if (x == 0 && y == 3) {
            return 3;
        } else if (x == 0 && y == 4) {
            return 4;
        } else if (x == 0 && y == 5) {
            return 5;
        } else if (x == 0 && y == 6) {
            return 6;
        } else if (x == 0 && y == 7) {
            return 7;
        } else if (x == 0 && y == 8) {
            return 8;
        } else if (x == 0 && y == 9) {
            return 9;
        } else if (x == 0 && y == 10) {
            return 10;
        }

        if (x > y) {
            return x + y; // Add y to x
        } else {
            return y + x;
        }

    }

    public static String countOnes(int[] array) {
        int counter = 0;
        for (int i : array) {
            switch (i) {
                case 1:
                    counter = counter + 1;
            }
        }
        return "Ones in the array: " + counter;
    }


    public static String countFours(int[] array) {
        int sumOfFours = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] == 4) {
                sumOfFours++;
            }
        }
        return "Number of fours: " + sumOfFours;
    }

}
