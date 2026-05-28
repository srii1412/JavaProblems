// largest number
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the largest numberr:");
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int largest;
          if(a>=b && a<=c){
              System.out.println("A is the Largest");
          }
          if(b>=a && b<=c){
              System.out.println("B is the Largest");
          }
          else{
              System.out.println("C is the Largest");
          }
         System.out.println("Largest :"+ largest);
          }
            }
            }
