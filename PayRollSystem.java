import java.util.Scanner;

public class PayRollSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("\n\n------------------------------------------------------------------------------------------------------------");
        System.out.println("\nWELCOME TO ECM'S SYSTEM");
        System.out.println("ECM'S $ACCOUNTING$ SYSTEM");
        System.out.println("Please fill in the following form to print your Payroll Statement\n");
                //NAME
            System.out.print("Enter Your Name: ");
            String name = scanner.nextLine();
                    //HOURS WORKED
            System.out.print("Enter the number of hours you worked in a Week: ");
            double hoursWorked = scanner.nextDouble();
                    //FOR PAY RATE PER HOUR
            System.out.print("Enter our hourly Pay Rate: ");
            double hourlyPayRate = scanner.nextDouble();
                    //FEDERAL TAX DEDUCTIONS
            System.out.print("Enter Federal Tax Withholding Rate(%): ");
            double federalTaxRate = scanner.nextDouble()/100; // formula for FEDERAL TAX
                    //GOVERMENT TAX DEDUCTIONS
            System.out.print("Enter Government Tax Withholding Rate(%): ");
            double governmentTaxRate = scanner.nextDouble()/100; //formula for GOVERMENT TAX

            double grossPay = hoursWorked * hourlyPayRate;  //FOR FORMULA 1>> OF GROSS SALARY (WITHOUT EXPENSES)
            double federalWithholding = grossPay * federalTaxRate;  //FOR FORMULA 2>> OF GROSS & FEDERAL TAX
            double governmentWithholding = grossPay * governmentTaxRate;    //FOR FORMULA 3>> OF THE GOVERMENT
            double netPay = grossPay - (federalWithholding + governmentWithholding);    //FOR FORMULA 4>> NET SALARY (INCLUDING TAX DEDUCTIONS)

                //IF ALL VALUES ARE POSITIVE! SHOW THIS
        if (hoursWorked>0 && hourlyPayRate>0 && federalTaxRate>0 && governmentTaxRate>0){
            System.out.println("\n This is Your Payroll Statement: "+name);
            System.out.println("Hours Worked: "+hoursWorked);
            System.out.println("Hourly Pay Rate: "+hourlyPayRate+" ZMW");
            System.out.println("Gross Pay: "+grossPay+" ZMW");
            System.out.println("\nDEDUCTIONS INCLUDES: ");
            System.out.println("Federal Tax Withholding: " +federalWithholding+" ZMW");
            System.out.println("Government Tax Withholding: "+governmentWithholding+" ZMW");
            System.out.println("Net Pay: "+netPay+" ZMW");
            System.out.println("\nTHANK YOU SPEND WISELY!!");
        }

             //IF ALL OR ONE THEM IS NEGATIVE! SHOW THIS
        else{
             System.out.println("\n !!ERROR!!");
            System.out.println("POSITIVE values only");
            System.out.println(" Please Start Again\n");
        }
      
        scanner.close();
    }
}



