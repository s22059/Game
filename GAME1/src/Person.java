import java.util.Random;

public class Person extends MapObject {
    public String toString() {
        return "⚫";
    }

    public String name;
    public int Health = 40;
    public int Mana = 20;
    public int Money = 0;
    public int Story = 0;
    public int posx;
    public int posy;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int posX, int posY) {
        this.name = name;
        this.posx = posX;
        this.posy = posY;
    }

    public void setStory(int story) {
        this.Story += story;
    }

    public void setPosX(int posX) {
        this.posx = posX;
    }

    public void setPosY(int posY) {
        this.posy = posY;
    }

    public void setDamage(int damage) {
        this.Health -= damage;
    }

    public void setHeal(int heal) {
        this.Health += heal;
    }

    public void setMana(int mana) {
        this.Mana -= mana;
    }

    public void setMoney(int money) {
        this.Money += money;
    }


}



















