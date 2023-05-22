public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {7, 8, 9}};
        int key = 8;
        Search(  arr, key);
    }
    static void Search(int[][]arr, int key) {
        int c = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == key) {
                    System.out.println("found at"+"[" + row + "]" + "[" + col + "]");
                    c = c + 1;
                    break;
                }
            }
        }
            if (c == 0) {
                System.out.println("Element not found");
            }


    }
}
