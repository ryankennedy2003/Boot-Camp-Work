package animals;


public class Cat {
    private String name;
    private String size;
    private int age;
    private String breed;

    public Cat(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark(String size) {
        String bark = "";
        if (size.equalsIgnoreCase("small")) {
            bark = "purr, purr, purr";
        } else if (size.equalsIgnoreCase("medium")) {
            bark = "meow, meow";
        } else {
            bark = "MEOW! MEOW!";
        }

        return bark;
    }

    public String play(String breed) {
        String playing = "";
        if(breed.equalsIgnoreCase("black")) {
            playing = "Oh dear, I dont think so";
        } else if(breed.equalsIgnoreCase("ginger")) {
            playing = "Yeah Yeah throw the stick";
        } else if(breed.equalsIgnoreCase("other")) {
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


