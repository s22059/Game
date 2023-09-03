public class Npc extends MapObject {
    public String toString() {
        return "x";
    }

    @Override
    public void process(Person person) {
        person.setStory(1);
        person.setHeal(5);
        person.setMana(5);
        System.out.println("No one: HEY YOU! STOP RIGHT THERE!\n" +
                "(He is looking at you like the first time)\n" +
                "Stranger: I told you we would see each other again.\n"+
                "No one: Why everywhere is mine?\n"+
                "Stranger: Because here is the place where you sleep.\n"+
                "No one: Why would I sleep in minefield ?\n"+
                "Stranger: I dont know you should ask it to the your commander.\n"+
                "No one: Commander ? Am I a soldier ?\n"+
                "Stranger: My time has come I must leave...\n"+
                "No one: Wait!(You try to hold him but your hand passed through his body.)\n"+
                "(You see a medicine on the floor. You took the medicine and used it) \n"+
                "(You decided to move on)");
    }

}


