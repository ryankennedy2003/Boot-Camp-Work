package games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    byte numberOfLives;
    String word;
    char guess;
    ArrayList<Character> guessedCharacters = new ArrayList<>();
    boolean guessedAll;
    char[] obscuredWord;
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Hangman hh = new Hangman();
        hh.getWord();
    }

    private void getWord() {
        //ask user for input
        System.out.println("Please enter the word to be guessed");
        //get input from user and put it in 'word'
        word = scn.nextLine().toLowerCase();
        hideWord();
    }

    private void hideWord() {
        //get the length of the word to define the size of the array
        obscuredWord = new char[word.length()];
        numberOfLives = (byte) word.length();
        int counter = 0;
        //loop over the word and add stars to the char[] for every letter or / for space
        for (char c : word.toCharArray()) {
            if (Character.isWhitespace(c)) {
                //add a slash to the array
                obscuredWord[counter] = '/';
            } else {
                //add a asterix to the array
                obscuredWord[counter] = '*';
            }
            counter++;
        }
        System.out.println("The word to be guessed is below");


        getGuess();
    }

    private void getGuess() {
        System.out.println(Arrays.toString(obscuredWord));
        //display the number of lives remaining
        System.out.println("You have " + numberOfLives + " lives remaining");
        //ask the user for a guess
        System.out.println("Enter a guess: ");
        //read guess
        guess = scn.nextLine().charAt(0);
        //check guess
        checkGuess(guess);
    }

    private void checkGuess(char guess) {
        //look at each of the characters in the word
        int counter = 0;
        boolean correct = false;
        int x = obscuredWord.length;
        for (Character c : word.toCharArray()) {
            if (c == guess) {
                obscuredWord[counter] = c;
                correct = true;

            }
            counter++;
        }
        //if any match the guess
        //update the obscured word

        if (!correct) {
            numberOfLives--;
            if(numberOfLives == 0){
                System.out.println("You have no lives remaining, better luck next time!");
                System.exit(0);
            }
            System.out.println("WRONG! now you have only " + numberOfLives + " remaining.");
        } else {
            System.out.println("Correct, well done");
            x = x-1;
            if(x==0){
                System.out.println("You have won, Congratulations!");
                System.exit(0);
            }
        }
        getGuess();
    }









}
