/*Brayden Coghill
300347436
November 2
sorting an array of numbers using the bubble sort algorithm.
 */
import java.util.Scanner;
public class Sorting{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like sorted? ");
        int number = input.nextInt();

        System.out.println("Enter 1 for integers and 2 for doubles. ");
        int choice = input.nextInt();

        if(choice == 1){
            int[] arr = new int[number];
            for(int i = 0; i < arr.length; i++){
                System.out.print("Enter a number: "); 
                arr[i] = input.nextInt();
            }
            bubbleSort(arr);
        }else if(choice == 2){
            double[] arr = new double[number];
            for(int i = 0; i < arr.length; i++){
                System.out.print("Enter a number: ");
                arr[i] = input.nextDouble();              
            }
            bubbleSort(arr);
        }

    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i >= arr.length-1){
                System.out.print(arr[i] + " ");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }
    
    public static void printArray(double[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i >= arr.length-1){
                System.out.print(arr[i] + " ");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        /*The i is used to make the sort more efficient. 
         * it sees if a number is bigger than the one beside it and if it is it keeps
         * sliding the number over until it reaches a number it is smaller than.
        */
        boolean needToSwap; 
        int temp;
        for(int i = 0; i < arr.length; i++){
            needToSwap = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    needToSwap = true;
                    printArray(arr);
                } 
            }
            if(needToSwap == false){
                break;
            }
        }
    }

    public static void bubbleSort(double arr[]){
        boolean needToSwap; 
        double temp;
        for(int i = 0; i < arr.length; i++){
            needToSwap = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    needToSwap = true;
                    printArray(arr);
                }
            }
            if(needToSwap == false){
                break;
            }
        }
    }
}