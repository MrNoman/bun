package fairytale;

public class Animal extends Creature implements Hunting{

    private String name;
    private Species species;
    private boolean alive;

    public Animal(String name, Species species){
        this.name = name;
        this.species = species;
        this.alive = true;
    }

    public String getName() {
        return this.name;
    }

    public void killCreature(Living living) {
        living.die();
        System.out.println(this.name + " съел " + living.getName());
    }

    public Species getSpecies() {
        return species;
    }
}
