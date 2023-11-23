/*Brayden Coghill
300347436
October 19, 2023
Sarah Foss

This program has a user enter a sentence then analyzes it for:
The sum of the digits in the string
The number of letters in the string
The number of vowels in the string
Whether or not the sentence contains all the letters of the word “awesome”
 */
import java.util.Scanner;
public class Method{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //User enters a sentence to be analyzed
        System.out.print("Enter a sentence to be analyzed: ");
        String sentence = input.nextLine();
        //prints out the results of testing the sentence
        System.out.println("The number of letters is: " + letters(sentence));
        System.out.println("The number of vowels is: " + vowels(sentence));
        System.out.println("The sum of digits is: " + digits(sentence));
        System.out.println(awesome(sentence));
    }
    //gives the sum of the digits in the String
    public static int digits(String sentence){
        int sum = 0;
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(Character.isDigit(c)){
                sum += c - '0';
            }
        } 
        return sum;
    }
    //checks the number of letters in the String
    public static int letters(String sentence){
        int sum = 0;
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            //if String contains a letter if will add 1 to sum. It is checking each character
            if(Character.isLetter(c)){ 
                sum++;
            }
        }
        return sum;
    }
    //checks the number of vowels in the String
    public static int vowels(String sentence){
        int sum = 0;
        for(int i = 0; i < sentence.length(); i++){
            char c = Character.toLowerCase(sentence.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                sum++;
            }
        }
        return sum;
    }
    // checks whether or not the String contains all the letters of the word “awesome”
    public static String awesome(String sentence){
        String awesome = "This sentence is awesome!";
        String notAwesome = "This sentence is not awesome...";
        int a = 0, w = 0, e = 0, s = 0, o = 0, m = 0;

        for(int i = 0; i < sentence.length(); i++){
            char c = Character.toLowerCase(sentence.charAt(i));
            //goes through the sentence and grabs all the letters of "awesome" it finds
            if(c == 'a'){
                a++; 
            }else if(c == 'w'){
                w++;
            }else if(c == 'e'){
                e++;
            }else if(c == 's'){
                s++;
            }else if(c == 'o'){
                o++;
            }else if(c == 'm'){
                m++;
            }
        }
        //checks if it has enough of each letter to make the word awesome.
        if(a >= 1 && w >= 1 && e >= 2 && s >= 1 && o >= 1 && m >= 1){
            return awesome;
        }else{
            return notAwesome;
        }
    }
}
