import java.util.Scanner;

public class TemperatureConvertor {
  static   Scanner scanner=new Scanner(System.in);
    //method convert Celcius  to fahrenheit
    static double celsiusToFahrenheit(double c){
        double f=(c * 9/5) + 32;
        return f;

    }
//method convert Celcius  to kelvin
    static double celsiusToKelvin(double c){
        double k=c + 273.15;
        return k;
    }
    //method convert fahrenheit to Celcius
    static double fahrenheitToCelsius(double f){
        double c = (f - 32) * 5/9;
        return c;
    }
    //method to convert Fahrenheit to Kelvin
    static double fahrenheitToKelvin(double f){
        double k= (f - 32) * 5/9 + 273.15;
        return k;
    }
    //method to convert kelvin to Celcius
    static double kelvinToCelsius(double k){
        double c = k - 273.15;
        return c;

    }
    //method to convert kelvint to fahrenheit
static double kelvinToFahrenheit(double k){
        double f=(k - 273.15) * 9/5 + 32;
        return f;
}
//method to read temperature input from the user
    static  double input(String word){
        System.out.println("Enter "+word+" value:");
        double val=scanner.nextDouble();
        return val;
    }
    //method to print converted value of  temperature
    static  void output(double val,String word){
        System.out.printf("%s value: %.2f",word,val);
    }
    //Driver Method
    public static void main(String[]args){
        System.out.println("1. Celcius to Fahrenheit\n2. Celcius to Kelvin\n"+
                "3. Fahrenheit to Celcius\n4. Fahrenheit to Kelvin\n"+
                "5. Kelvin to Celcius\n6. Kelvin to Fahrenheit\n7. Exit");
        do{
            System.out.println("\n Enter Choice: ");
            int ch=scanner.nextInt();
            double num=0;
            switch (ch){
                case 1: num = input("Celcius");
                output(celsiusToFahrenheit(num),"Fahrenheit");
                break;
                case 2: num = input("Celcius");
                output(celsiusToKelvin(num),"Kelvin");
                break;
                case 3: num = input("Fahrenheit");
                output(fahrenheitToCelsius(num),"Celcius");
                break;
                case 4: num = input("Fahrenheit");
                output(fahrenheitToKelvin(num),"Kelvin");
                break;
                case 5: num = input("Kelvin");
                output(kelvinToCelsius(num),"Celcius");
                break;
                case 6: num = input("Kelvin");
                output(kelvinToFahrenheit(num),"Fahrenheit");
                break;
                case 7:  System.exit(0);
                    break;
                default: System.out.println("Invalid Input");
            }

        }while (true);
    }
}
