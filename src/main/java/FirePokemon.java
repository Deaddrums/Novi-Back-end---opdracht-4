package main.java;

public class FirePokemon extends Pokemon {

    private int attackPower;
    private String favoriteFood;

    public FirePokemon(String name, int hp, int attackPower, String favoriteFood) {
       super(name, hp);
        this.attackPower = attackPower;
        this.favoriteFood = favoriteFood;
    }

    public void inferno() {
        System.out.println(getName() + " gebruikt inferno!");
    }

    public void fireLash () {
        System.out.println(getName() + " gebruikt fire lash!");
    }

    @Override
    public void speaks() {
        System.out.println(getName()  + " roept: 'char char!'");
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
