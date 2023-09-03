import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        //create map
        Map map = new Map(10, 10);
        //create person
        Person character = new Person();
        //create random int for map size
        int random1 = rnd.nextInt(map.height);
        int random2 = rnd.nextInt(map.width);
        character.setPosX(random1);
        character.setPosY(random2);

        for (int i = 0; i < 45; i++) {
            map.placeObject(new Trap());
        }
        for (int i = 0; i < 6; i++) {
            map.placeObject(new Coin());
        }
        map.placeObject(new Photograph());
        map.placeObject(new BrokenMirror());
        map.placeObject(character, character.posx, character.posy);
        map.placeObject(new Npc());
        System.out.println("You suddenly woke up in the middle of nowhere and you cant even remember your name that's why we will call you no one for now. When you open your eyes you someone staring at you.\n"
                + "No one: Hey you. (still staring at you)\n"
                + "No one: Who are you ? Where am I?\n"
                + "Stranger: I know who you are and where you are, dont you?\n"
                + "(You realized that he is talking without moving any muscle of his face. He is like a dead.)\n"
                + "No one: What are you talking about I don remember anything.\n"
                + "Stranger: Okay I see. We will see each other again.(He disappear in front of your eyes.)\n"
                + "No one: What the... I think I should walk away from here");
        System.out.println("'⚫' this is your character,\n'+' is mine if you step on it you will get hurt,\n 'x' is the guy who saw when you woke up,\n '$' is some coin on the floor \n and the other things are for story.");
        map.showMap();

        do {
            System.out.println("Where do you want to go? (north,south,west,east)");
            String a = sc.nextLine();
            map.MoveCharacter(a, character);
            map.showMap();
            System.out.println(character.Health + " " + character.Money + " " + character.Story);

        }
        while (character.Health > 0 && character.Story != 4);
        if (character.Health > 0) {
            System.out.println("Our character is a World War II veteran. He is a soldier of a unit that is caught in the middle of a minefield while moving along the line of fire. \n" +
                    "Our hero watched his friend die in front of his eyes\n" +
                    "He is seriously injured after passing through a minefield as a mine exploded nearby\n" +
                    "He loses half of his right leg and falls into a coma.\n" +
                    "(You woke up from coma. First thing you see is The picture on the wall. You realised the Stranger and you are side by side on that photo then you remember He was your best friend.)");
            System.out.println("The money that you collect is nothing because its just a dream.");
        } else {
            System.out.println("You lose.");
        }
    }
}


