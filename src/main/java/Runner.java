import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"
                int skyeIndex = scottishIslands.indexOf("Skye");
                System.out.println("Skye index: " + skyeIndex);

//        5. Remove "Tresco" from the list by name
                scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
            scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
            System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
                Collections.sort(scottishIslands);
//                for (String i : scottishIslands){
//                    System.out.println(i);
//                } ---> not needed

//        9. Print out all the islands using a for loop
                for (String i : scottishIslands){
                    System.out.println(i);
                }

//                for (int 1 = 0; i < scottishIslands.size(); i++){
//                System.out.println(scottishIslands.get(i));
//                } ---> using an enhance for loop

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//     1. Print out a list of the even integers
        List<Integer> numbers2 = new ArrayList<>();
        for(int i=0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0) {
                numbers2.add(numbers.get(i));
            }
        } System.out.println(numbers2);

        /* for(int number : numbers) {
            if((number % 2) ==0) {
            System.out.println(number); --> other ways to solve the Q's */

        /* list<Integer> evenNumbers = new ArrayList<>();
            for (int number : numbers) {
            if ((number % 2) == 0){
                evenNumbers.add(number);
                } }
                System.out.println(evenNumbers); --> another way to solve */


//        2. Print the difference between the largest and smallest value
            System.out.println(Math.abs(99-1));

        /* Collections.sort(numbers);
        System.out.println(numbers.get(numbers.size() -1) - (numbers.get(0))); --> correct answer */

       /* int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);
        System.out.println(maxNumber - minNumber); --> another way to solve */

        /* int max = numbers.get(0);
        int min = numbers.get(0);
        for (int i =1; i < numbers.size(); i++){
                if (numbers.get(i) > max){
                    max = numbers.get(i);
                }
                else if(numbers.get(i) < min) {
                    min = numbers.get(i)
                } ---> answer from group discussion */

//        3. Print true if the list contains a 1 next to a 1 somewhere
        for(int i=0; i < numbers.size(); i++){
            if(numbers.get(i)==1 && numbers.get(i+1)==1){
                System.out.println(true);
            }
        }

//        4. Print the sum of the numbers
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        System.out.println(sum);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

        //ANNA'S ANSWER
        //Check whether a number is 13
        //if tracking index, that if I hit #13, stop incrementing the index

        int total = 0;
        System.out.println("actual numbers: " + numbers);
        for (int number : numbers){
            if (number == 13);
                break;
            }
                total += numbers;
            }System.out.println(total);
        }

