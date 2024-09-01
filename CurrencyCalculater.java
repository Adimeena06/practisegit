import java.util.Scanner;  
public class CurrencyCalculater {  
    public static void main(String[] args) {  
        // Create a Scanner object for user input  
        Scanner scanner = new Scanner(System.in);  
        // Display a welcome message  
        System.out.println("We will convert your money with any country money!");  
        // Main program loop  
        while (true) {  
            // Display the menu  
            System.out.println("\nMenu:");  
            System.out.println("1. Convert USD to EUR");  
            System.out.println("2. Convert EUR to USD"); 
            System.out.println("3. Convert Rupee to USD");  
            System.out.println("4. Convert USD to Rupee");  
            System.out.println("5. Convert Rupee to EUR");  
            System.out.println("6. Convert EUR to Rupee");  
            System.out.println("7. Convert URB to Rupee");  
            System.out.println("8. Convert Rupee to URB");   
            System.out.println("9. Quit");  
            System.out.print("Enter your choice: ");  
            // Read the user's choice  
            int choice = scanner.nextInt();  
            // Perform the chosen operation  
            switch (choice) {  
                case 1:  
                    convertUSDToEUR();  
                    break;  
                case 2:  
                    convertEURToUSD();  
                    break;  
                case 3:
                    convertRupeetoUSD();
                    break;
                case 4:
                    convertRupeetoUSD();
                    break;
                case 5:
                    convertEURToRupee();
                    break;
                case 6:
                    convertEURToRupee();
                    break;
                case 7:
                    convertURBToRupee();
                    break;
                case 8:
                    convertRupeeToURB();
                    break;
                case 9:  
                    System.out.println("Thank you for using the Currency Converter!");  
                    // Close the scanner  
                    scanner.close();  
                    return;  
                default:  
                    System.out.println("Invalid choice. Please try again.");  
            }  
        }  
    }  
    // Conversion rates (hardcoded for simplicity)  
    private static double usdToEurRate = 0.85;  
    private static double eurToUsdRate = 1.18;  
    private static double usdToRupeeRate = 74.83;
    private static double RupeetousdRate = 87.73;
    private static double eurToRupeeRate = 0.145;
    private static double RupeeToeurRate = 6.93;
    private static double URBtoRupeeRate = 0.015;
    private static double RupeeToURBRate = 66.67;
    // Method to convert USD to EUR  
    private static void convertUSDToEUR() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in USD: ");  
        double usdAmount = scanner.nextDouble();  
        double eurAmount = usdAmount * usdToEurRate;  
        System.out.println(usdAmount + " USD is equivalent to " + eurAmount + " EUR");  
    }  
    // Method to convert EUR to USD  
    private static void convertEURToUSD() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in EUR: ");  
        double eurAmount = scanner.nextDouble();  
        double usdAmount = eurAmount * eurToUsdRate;  
        System.out.println(eurAmount + " EUR is equivalent to " + usdAmount + " USD");  
    }  
    
    // Method to convert Rupee to USD 
    private static void convertRupeetoUSD() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in Rupee: ");  
        double RupeeAmount = scanner.nextDouble();  
        double USDAmount = RupeeAmount * RupeetousdRate;  
        System.out.println(RupeeAmount + " Rupee is equivalent to " + USDAmount + " USD");  
    }  
    // Method to convert USD to Rupee 
    private static void convertUSDtoRupee() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in Rupee: ");  
        double USDAmount = scanner.nextDouble();  
        double RupeeAmount = USDAmount * usdToRupeeRate;  
        System.out.println(USDAmount + " USD is equivalent to " + RupeeAmount + " Rupee");  
    }  
    // Method to convert Rupee to EUR 
    private static void convertRupeetoEUR() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in Rupee: ");  
        double RupeeAmount = scanner.nextDouble();  
        double EURAmount = RupeeAmount *RupeetousdRate;  
        System.out.println(RupeeAmount + " Rupee is equivalent to " + EURAmount + " EUR");  
    }  

    // Method to convert EUR to Rupee 
    private static void convertEURToRupee() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in Rupee: ");  
        double EURAmount = scanner.nextDouble();  
        double RupeeAmount = EURAmount * eurToRupeeRate;  
        System.out.println(EURAmount + " EUR is equivalent to " + RupeeAmount + " Rupee");  
    }  

    // Method to convert Rupee to URB 
    private static void convertRupeeToURB() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in URB: ");  
        double RupeeAmount = scanner.nextDouble();  
        double URBAmount = RupeeAmount * RupeeToURBRate;  
        System.out.println(RupeeAmount + " Rupee is equivalent to " + URBAmount + " URB");  
    }  

     // Method to convert URB to Rupee 
     private static void convertURBToRupee() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in URB: ");  
        double URBAmount = scanner.nextDouble();  
        double RupeeAmount = URBAmount *URBtoRupeeRate;  
        System.out.println(URBAmount + " URB is equivalent to " + RupeeAmount + " Rupee");  
    }  
    
 Scanner closeScanner;
    
}  
