import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key to be searched");
        int key = sc.nextInt();
        int answer=Linear(arr, key);
        if(answer==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("found at"+answer);
        }

       /*first method to do
        int c=0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == key) {
                System.out.println("Key found at" + j);
                c=c+1;
                break;
            }
        }

        if(c==0){
            System.out.println("Element not found");
        } */
    }

        static int Linear(int[] arr, int key){
        if(arr.length==0){
            return -1;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
            return -1;

    }
}

