package main.java;

public class Pokemon {

    private String name;
    private int hp;

    public Pokemon(String name, int hp) {
      this.name = name;
      this.hp = hp;
    };

    public void eats() {
        System.out.println(name + " is aan het eten");
    }

    public void speaks() {
        System.out.println(name + " maakt een geluid");
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setHp (int hp){
        this.hp = hp;
    }
}
