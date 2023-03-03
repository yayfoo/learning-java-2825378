import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What fruit contains most sugar?";
        String choiceOne = "apples";
        String choiceTwo = "kiwis";
        String choiceThree = "bananas";

        String correctAnswer = choiceThree;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne + ", " + choiceTwo + " or " + choiceThree + "?");

        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (userInput.equals(correctAnswer)) {
            System.out.println("Congrats, " + userInput + " is the correct answer!");
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println("Sorry, " + userInput + " is incorrect. The correct answer is " + correctAnswer + ".");
        }

    }

}
