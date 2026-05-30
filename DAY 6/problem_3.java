// Merged Arrayy
// Output
Enter the size of the first array:
4
Enter the first array:
1
3
8
9
Enter the size of the second array:
3
Enter the second array:
10
18
19
Merged Array:
1 3 8 9 10 18 19 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter the first array:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter the second array:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merge = new int[n1 + n2];

        for(int i = 0; i < n1; i++) {
            merge[i] = arr1[i];
        }

        for(int i = 0; i < n2; i++) {
            merge[n1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");
        for(int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }

        sc.close();
    }
}
