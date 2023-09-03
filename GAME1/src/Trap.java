public class Trap extends MapObject {
    public String toString() {
        return "+";
    }

    @Override
    public void process(Person person) {
        person.setStory(1);
        person.setDamage(10);
        System.out.println("(You stepped on a mine and it exploded,\n" +
                "suddenly you saw a memory from the past. The Stranger, other soldiers, and a minefield.)\n" +
                "Stranger: If we don't want to be shot we have to get moving.\n" +
                "Sound from behind: I dont want to die here.\n" +
                "Commander: Everyone! Listen to me! We need to pass this minefield, the enemy soldiers one hour away from us!\n" +
                "No one: He is right. If we dont pass they catch us and they torture us, stepping on a mine is a better way to die.\n" +
                "Stranger: Okay. Wait for me I have an idea.(He started to take heavy rocks and come back)\n" +
                "Stranger: Are you ready ?\n" +
                "No one: Yes\n" +
                "(He throw the rock on the floor and BOOM! The mine explode)\n" +
                "Stranger: You see that. This is the proof that I am a geniu...\n" +
                "(Then he fell down. You hold him but you felt a warmth in your hand. When you looked at your hand you saw blood.\n" +
                "(You woke up and your head is shaking you looked at the place where mine supposed to be but you couldn't see anything about the explosion.\n" +
                "No one: Why am I alive. Why I see the Strange guy in my memory and why I feel like I saw this memory over and over again?\n" +
                "No one: I want to leave this place.");
    }
}
