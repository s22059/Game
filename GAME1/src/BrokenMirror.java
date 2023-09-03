public class BrokenMirror extends MapObject {
    public String toString() {
        return "⎚";
    }

    @Override
    public void process(Person person) {
        person.setStory(1);
        System.out.println("(You found broken mirror. You saw yourself and remembered a memory. They are cutting your hair and you are not the only one in there.\n" +
                "(Strange thing is everyone's hair is the same, short. So short they look like bald  ");
    }
}
