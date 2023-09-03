public class Coin extends MapObject {
    public String toString() {
        return "$";
    }

    @Override
    public void process(Person person) {
        person.setMoney(10);
    }
}
