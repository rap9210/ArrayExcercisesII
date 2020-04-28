import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercisesII {
    public static void main(String[] args){
        //I. Write a program to print a string in reverse.
        /*
        1. Prompt user for string input and store it.
        2. Split it to get a String array of the characters of the string
        3. Initialize empty Array of length of imputed string
        4. Use for loop starting at the last string of the split string array
           and begin equating them to the opposite index in the empty array.
        5. Print no longer empty array.
         */
         Scanner scn = new Scanner(System.in);
        int i, x=0;
        System.out.println("Enter a sentence: ");
        String user_input = scn.nextLine();
        String user_input_array[] = new String[user_input.length()];
        user_input_array = user_input.split("");
        String tupni_resu[] = new String[user_input.length()];
        for (i=user_input.length()-1;i>=0;i--){
            tupni_resu[x] = user_input_array[i];
            System.out.print(tupni_resu[x]);
            x++;
        }
        //II. Prompt the user to input 10 integer values and store them into an array. If there are any duplicate values in that array,
        //    remove them and print out the remaining values.
        /*
        1. Initialize empty array of length 10
        2. Prompt user for 10 integers
        3. Use for loop to store the integers in the array
        4. Use a second for loop to check if a number is already in the
           array.
        5. Add a condition in second loop of no numbers that already
           exist in the array will be added. If an equal value is found,
           add 1 to a counter.
        6. Use the counter to condition another statement
           that will add the number to the array if the count is 0.
        7. Print array
         */
        int num_array[] = new int[10];
        System.out.println("\nPlease enter 10 integer values: ");
        int array_check = 0;
        for (i=0; i<10; i++){
            System.out.print(i + 1 + ")");
            int num_input = scn.nextInt();
            for (x=0; x<10; x++) {
                if (num_input == num_array[x]) {
                    array_check += 1;
                }
            }if (array_check == 0){
                num_array[i] = num_input;
            }
            }
        System.out.println(Arrays.toString(num_array));

        //III. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13
        /*
        1. Initialize given arrays.
        2. Use one for loop to go through each element of one of the arrays.
        3. Use a second loop to match each element in the first array to the second.
        4. Initialize 0 int to store the sums.
        5. Add condition to print that if an element in the first + an element in the second
        is equal to 13, Print them out.
         */
        int array_1[] = {1, 7, 6, 5, 9};
        int array_2[] = {2, 7, 6, 3, 4};
        System.out.println("array 1: "+Arrays.toString(array_1));
        System.out.println("array 2: "+Arrays.toString(array_2));
        int sum_13 = 0;
        for (i=0; i<5; i++){
            for (x=0; x<5; x++){
                sum_13 = array_1[i]+array_2[x];
                if (sum_13 == 13){
                    System.out.println("("+array_1[i]+","+array_2[x]+")");
                }

            }
        }
        //IV. Prompt the user to input 10 values and store them into an array.
        //    Output the total number of odd and even values in the array.
        /*
        1. Initialize empty integer array and 2 integer variables to count odds and evens.
        2. Prompt user for 10 integer values and store them in empty array.
        3. Use for loop to go through elements of the array.
        4. Check each element for odd or even using modulo(%).
        5. Count each odd and each even and store the numbers.
        6. Print out those numbers.
         */
        int num_array_2[] = new int[10];
        int num_evens = 0;
        int num_odds = 0;
        System.out.println("Enter 10 integer values: ");
        for (i=0; i<10; i++){
            System.out.print(i+1+")");
            int value_inputs = scn.nextInt();
            num_array_2[i] = value_inputs;
            if (num_array_2[i]%2 == 0){
                num_evens+=1;
            }else if (num_array_2[i]%2 == 1){
                num_odds+=1;
            }
        }
        System.out.println("Odds: "+num_odds);
        System.out.println("Evens: "+num_evens);

        //(Challenge!) Prompt the user to input one line of a string.
        // Parse the string into a word, print out the word and length of the word.
        // Assume that the maximum size of a line is 132.
        /*
        1. Prompt user for input of a string.
        2. Split that string by its blank spaces, store it in an array.
        3. Use for loop to go through every element (the words) in the array.
        4. Use .length() on every word to get the number of characters.
        5. Print each word with its length in characters.
         */
        scn.nextLine();
        System.out.println("Enter a sentence up to 132 characters: ");
        String challenge_input = scn.nextLine();
        while(challenge_input.length()>132){
            System.out.println("Error: You have entered more than 132 characters.\nPlease enter a sentence up to 132 characters.");
            challenge_input = scn.nextLine();
        }
        System.out.println("You entered: "+challenge_input);
        String challenge_array[];
        challenge_array = challenge_input.split(" ");
        for (i=0; i<Array.getLength(challenge_array); i++){
            System.out.println(challenge_array[i]+" has "+challenge_array[i].length()+" characters.");
        }
    }
}
