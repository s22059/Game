public class Photograph extends MapObject {
    public String toString() {
        return "✉";
    }

    @Override
    public void process(Person person) {
        person.setStory(1);
        System.out.println("(You saw a photograph on the floor, this photograph you picked up and examined was a picture of a group of soldiers)\n" +
                "(Then you realize that the person on the top right is the one who just disappeared )\n");
    }
}
