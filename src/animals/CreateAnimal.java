package animals;

import java.util.Locale;
import java.util.Scanner;

public class CreateAnimal {
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        CreateAnimal create = new CreateAnimal();
        create.getAnimalType();
    }

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = scn.nextLine();

        switch(animal.toLowerCase()){
            case "dog":
                createDog();
                break;
            case "cat":
                createCat();
                break;
            default:
                System.out.println("We cannot currently create that animal. Sorry!");
        }
    }
    private void createDog(){
        System.out.println("What is the name of your dog?");
        String name = scn.nextLine();
        System.out.println("What is the size of your dog?");
        String size = scn.nextLine();
        System.out.println("What is the breed of your dog?");
        String breed = scn.nextLine();
        System.out.println("What is the age of your dog?");
        int age = Integer.parseInt(scn.nextLine());
        Dog myDog = new Dog(name, size, age, breed);
        System.out.println("Name: " + name + "   Size: " + size + "   Age: " + age + "   Breed: " + breed);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.out.println(myDog.bark(size));
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.out.println(myDog.play(breed));
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.out.println(myDog.beHuman(name, age, breed));
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }

        getAnimalType();
    }
    private void createCat(){
        System.out.println("What is the name of your cat?");
        String name = scn.nextLine();
        System.out.println("What is the size of your cat?");
        String size = scn.nextLine();
        System.out.println("What is the breed of your cat?");
        String breed = scn.nextLine();
        System.out.println("What is the age of your cat?");
        int age = Integer.parseInt(scn.nextLine());
        Cat myCat = new Cat(name, size, age, breed);
        System.out.println("Name: " + name + "   Size: " + size + "   Age: " + age + "   Breed: " + breed);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.out.println(myCat.bark(size));
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.out.println(myCat.play(breed));
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.out.println(myCat.beHuman(name, age, breed));
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }

        getAnimalType();
    }



}

