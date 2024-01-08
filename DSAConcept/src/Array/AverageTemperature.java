package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageTemperature {
    int[] temperatureArr;
    public void createTemperatureAraay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's temperature you want to store : ");
        int numDays = sc.nextInt();
        temperatureArr = new int[numDays] ;
        for(int i = 1; i<=numDays; i++){
            System.out.println("Enter day " + i + " high temperature" );
            int temp = sc.nextInt();
            temperatureArr[i-1] = temp;
        }
    }
    public double calculateAverage(int[] arr){
        int sum = 0;
        double average = 0;
        for(int temp:arr){
            sum += temp;
        }
        average = sum/arr.length;
        return average;
    }
    public int findNumberOfDaysAboveAverage(int[] arr, double averageTemperature){
        int count = 0;
        for(int temp : arr){
            if(temp>averageTemperature){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        AverageTemperature at = new AverageTemperature();
        at.createTemperatureAraay();
        System.out.println("Temperature array : " + Arrays.toString(at.temperatureArr));
        System.out.println("Average temperature is : " + at.calculateAverage(at.temperatureArr));
        System.out.println("Number of days above average temperature is : " + at.findNumberOfDaysAboveAverage(at.temperatureArr,at.calculateAverage(at.temperatureArr)));
    }

}
