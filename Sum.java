/*
 * Name: Kennedy Keyes
 * Date: April 2, 2021
 * Name of Program: Sum.java
 * Description: This program will sum integers by using the for statement.
 */
package sum;

/**
 *
 * @author codingken
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        
        // total even integers from 2 through 20
        for (int number = 2; number <= 20; number += 2) {
            total += number;
        }
        
        System.out.printf("Sum is %d%n", total);
    }
    
}
