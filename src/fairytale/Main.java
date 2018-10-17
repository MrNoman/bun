package fairytale;

public class Main {

    public static void main(String[] args) {

        Human gran = new Human("Бабушка");
        Human grandpa = new Human("Дедушка");
        Bun bun = Bun.getInstance();

        gran.scratchSuseki();
        grandpa.setBunName("Колобок", bun);

        bun.doComunicate(gran);
        bun.doComunicate(grandpa);

        Hunting animanl = new Animal("Заяц", Species.RABBIT);
        bun.doComunicate(animanl);

        animanl = new Animal("Волк", Species.VOLF);
        bun.doComunicate(animanl);

        animanl = new Animal("Медведь", Species.BEAR);
        bun.doComunicate(animanl);

        animanl = new Animal("Лиса", Species.FOX);
        bun.doComunicate(animanl);
    }
}
