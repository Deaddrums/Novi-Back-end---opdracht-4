package main.java;

public class WaterPokemon extends Pokemon {

    private int attackPower;
    private String favoriteFood;

    public WaterPokemon(String name, int hp, int attackPower, String favoriteFood) {
        super(name, hp);
        this.attackPower = attackPower;
        this.favoriteFood = favoriteFood;
    }

    public void hydroPump() {
        System.out.println(getName() + " gebruikt hydro pump!");
    }

    public void surf() {
        System.out.println(getName() + " gebruikt surf!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " roept: 'squirtle squirtle!'");
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