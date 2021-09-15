package animals;


public class Dog {
    private String name;
    private String size;
    private int age;
    private String breed;

    public Dog(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark(String size) {
        String bark = "";
        if (size.equalsIgnoreCase("small")) {
            bark = "yap, yap, yap";
        } else if (size.equalsIgnoreCase("medium")) {
            bark = "woof woof";
        } else {
            bark = "WOOF! WOOF!";
        }

        return bark;
    }

    public String play(String breed) {
        String playing = "";
        if(breed.equalsIgnoreCase("poodle")) {
            playing = "Oh dear, I dont think so";
        } else if(breed.equalsIgnoreCase("Labrador")) {
            playing = "Yeah Yeah throw the stick";
        } else if(breed.equalsIgnoreCase("Border Collie")) {
            playing = "Lets go chase some sheep";
        } else{
            playing = "Pass me the ball!";
        }
        return playing;
    }
    public String beHuman(String name, int age, String breed){
        return "Hello human I'm " + name + " and I am " + age + " years old. " + "I am a " + breed + ", what breed are you?";
    }
}

