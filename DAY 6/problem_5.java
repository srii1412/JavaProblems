// duplicates
// output
Enter the size of the first array:
4
Enter the first array:
2
3
4
5
Enter the size of the second array:
2
Enter the second array:
3
5
Common Arrays:
3 
5
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

        // Duplicatess
        System.out.println("Common Arrays:");
        for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            if(arr1[i]==arr2[j]){
        System.out.println(arr1[i]+" ") ;       
            }
        }
        }

        sc.close();
    }
}
