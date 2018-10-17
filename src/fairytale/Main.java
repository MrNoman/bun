package fairytale;

public class Main {

    public static void main(String[] args) {

        Human gran = new Human("Бабушка");
        Human grandpa = new Human("Дедушка");
        Bun bun = Bun.getInstance();

        gran.scratchSuseki();
        grandpa.setBunName("Колобок", bun);

        doComunicate(bun, gran);
        doComunicate(bun, grandpa);

        Hunting animanl = new Animal("Заяц", Species.RABBIT);
        doComunicate(bun, animanl);

        animanl = new Animal("Волк", Species.VOLF);
        doComunicate(bun, animanl);

        animanl = new Animal("Медведь", Species.BEAR);
        doComunicate(bun, animanl);

        animanl = new Animal("Лиса", Species.FOX);
        doComunicate(bun, animanl);
    }

    public static void doComunicate(Creature creature, Creature creature2){
        creature.doTalk(creature2);
        creature.doLeave(creature2);
    }

    public static void doComunicate(Creature creature, Hunting hunter){
        creature.doTalk(hunter);
        if (hunter.getSpecies() == Species.FOX) {
            hunter.killCreature(creature);
        } else {
            creature.doLeave(hunter);
        }
    }

}
