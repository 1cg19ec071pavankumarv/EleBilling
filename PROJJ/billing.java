import java.util.Scanner;
public class billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the number of unit Consumed : ");
         int unitsConsumed= sc.nextInt();
        
         double billAmount = calculateBill(unitsConsumed);
         System.out.println("Your electricity Bill Amount is = $ "+ billAmount);

         sc.close();
    }



         public static double calculateBill(int units){

         
         
            double billAmount;
            double basePrise = 15.0;
            double additionalPrice=0.5;

            if(units <= 100){
                billAmount = basePrise;
                
            }
            else{
                billAmount = basePrise + (units -100)*additionalPrice;
            }

    return billAmount;
        }
    }

    

    

