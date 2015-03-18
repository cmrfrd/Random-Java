import java.util.Scanner;
public class RainFall
{
  public static void main(String[] args)
  {
    String[] months = {
      "January",
      "February",
      "March",
      "April",
      "May",
      "June",
      "July",
      "August",
      "September",
      "October",
      "November",
      "December"
    };//All months in a string array
    double[] month_rain = new double[12];//will store rain double vals
  
    Scanner input = new Scanner(System.in);//initialize input
    
    for(int i = 0;i < 12;i++){
      System.out.println(months[i]+" Rainfall: ");
      month_rain[i] = input.nextDouble();
      if (month_rain[i]<0){
        System.out.println("No Negative Values\n");
        i--;
      }
    }
    //loops through months and asks for value
    //will decrement i variable if negative value
    System.out.println("Total Rainfall: "+totalRainfall(month_rain));
    System.out.println("Average Rainfall: "+averageRainfall(month_rain));
    System.out.println("Smallest Rainfall: "+smallestRainfall(month_rain));
    System.out.println("Largest Rainfall: "+largestRainfall(month_rain));
  }
  public static double totalRainfall(double[] arr){//gets sum of array
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return(sum);
  }
  public static double averageRainfall(double[] arr){//gets average of array from sum of array
    return(totalRainfall(arr)/arr.length);
  }
  public static double smallestRainfall(double[] arr){//lineary searches for smalles
    double min = arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    return(min);
  }
  public static double largestRainfall(double[] arr){//lineary searched for largest
    double max = arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return(max);
  }
}
