package array.my;

public class Array1Simple {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int[] arr2 = new int[]{6, 7, 8, 9, 10};
        int[][] arrSquare = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


        /*
        12345
        12345
        12345
        12345
        12345
         */
        for (int i = 0; i < arrSquare.length; i++) {
            for (int j = 0; j < arrSquare[i].length; j++) {
                System.out.print(arrSquare[i][j]);
            }
            System.out.println();
        }

        /*
        1
        2
        3
        4
        5
         */
        //향상된 for문. 각각의 요소를 검색하는 것
        for (int number: arr) {
            System.out.println(number);
        }

        for (int number : arr2) {
            System.out.println(number);
        }
    }
}
