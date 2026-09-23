package main.java;

public class GrassPokemon extends Pokemon {

        private int attackPower;
        private String favoriteFood;

        public GrassPokemon(String name, int hp, int attackPower, String favoriteFood) {
            super(name, hp);
            this.attackPower = attackPower;
            this.favoriteFood = favoriteFood;
        }

        public void leafStorm() {
            System.out.println(getName() + " gebruikt leaf storm!");
        }

        public void solarBeam () {
            System.out.println(getName() + " gebruikt solar beam!");
        }

        @Override
        public void speaks() {
            System.out.println(getName()  + " roept: 'bulba bulba!'");
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
