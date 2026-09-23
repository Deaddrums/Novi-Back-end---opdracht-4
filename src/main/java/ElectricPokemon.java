package main.java;

public class ElectricPokemon extends Pokemon {

    private int attackPower;
    private String favoriteFood;

    public ElectricPokemon (String name, int hp, int attackPower, String favoriteFood) {
        super(name, hp);
        this.attackPower = attackPower;
        this.favoriteFood = favoriteFood;
    }

    public void thunder() {
        System.out.println(getName() + " gebruikt thunder!");
    }

    public void voltTackle() {
        System.out.println(getName() + " gebruikt volt tackle!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " roept: 'pika pika!'");
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

}