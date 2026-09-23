package main.java;

public class main {

    public static void  main (String[] args){

    FirePokemon charmander = new FirePokemon("Charmander", 39, 52, "Bessen");
    WaterPokemon squirtle = new WaterPokemon("Squirtle", 44, 48, "vis");
    ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 35, 55, "ketchup");
    GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 45, 49, "zonlicht");

    charmander.inferno();
    squirtle.surf();
    pikachu.thunder();
    bulbasaur.solarBeam();

    charmander.eats();
    squirtle.speaks();
}
}
