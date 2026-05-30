// search in array
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean found = false;
        int search = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                found =true;
                break;
            }
            if(found){
        System.out.println("Found");
            }
            else{
          System.out.println(" Not Found");
            }
        }
    }
