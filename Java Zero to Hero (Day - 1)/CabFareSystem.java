// Cab Fare System

import java.util.Scanner;

class Cab {
    int fare;
    
    Cab() {
        fare = 35;
    }
    
    Cab(int bamt) {
        fare = bamt;
    }
    
    void showFare() {
        System.out.println("Payable Amount Rs. "+fare+"/-");
    }
}

class Travel {
    public static void main(String args[]) {
      System.out.println("");
      Scanner sc = new Scanner(System.in);
      System.out.println("Cab Fare System");
      System.out.println("----------------------------------------------------------");
      
      int curr_user;
      System.out.println("Enter the distance travelled to pickup the user (in kms) ");
      curr_user = sc.nextInt();
      
      int d;
      System.out.println("Enter the distance travelled by the user (in kms) ");
      d = sc.nextInt();
      
      System.out.println("----------------------------------------------------------");
      
      if (curr_user <= 5 ) {
          Cab id = new Cab();
          id.fare += 13 * d;
          id.showFare();
      }
      else {
          Cab id = new Cab(35 + (curr_user - 5) * 5);
          id.fare += 13 * d;
          id.showFare();
      }
    }
}