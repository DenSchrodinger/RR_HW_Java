package HW_5;

public class HW5 {
    public static void main(String[] args) {

        System.out.println("Задача №1\n");
//        int[][] arr1 = {
//                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
//                {0, 1, 2, 3, 4, 5, 6, 7, 8},
//                {0, 1, 2, 3, 4, 5, 6, 7},
//                {0, 1, 2, 3, 4, 5, 6},
//                {0, 1, 2, 3, 4, 5},
//                {0, 1, 2, 3, 4},
//                {0, 1, 2, 3},
//                {0, 1, 2},
//                {0, 1},
//                {0},
//        };
//        for (int i = 0 ; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n=========================\n Задача №2\n");
//        int[][] arr2 = {
//                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
//                {0, 1, 2, 3, 4, 5, 6, 7, 8},
//                {0, 1, 2, 3, 4, 5, 6, 7},
//                {0, 1, 2, 3, 4, 5, 6},
//                {0, 1, 2, 3, 4, 5},
//                {0, 1, 2, 3, 4},
//                {0, 1, 2, 3},
//                {0, 1, 2},
//                {0, 1},
//                {0},
//        };
//        for (int i = 0 ; i < arr2.length; i++) {
//            for (int k = 0; k < i; k++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(" " + arr2[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 10 ; i >= 0 ; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n=========================\n Задача №3\n");
//        int[][] arr3 = {
//                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
//                   {8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8},
//                      {7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7},
//                         {6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6},
//                            {5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5},
//                               {4, 3, 2, 1, 0, 1, 2, 3, 4},
//                                  {3, 2, 1, 0, 1, 2, 3},
//                                     {2, 1, 0, 1, 2},
//                                        {1, 0, 1},
//                                           {0},
//        };
//        for (int i = 0 ; i < arr3.length; i++) {
//            for (int k = 0; k < i; k++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < arr3[i].length; j++) {
//                System.out.print(" " + arr3[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 10 ; i >= 0 ; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 1 ; k < i ; k++) {
                    System.out.print(k + " ");
                }
            System.out.println();
            }

    }
}