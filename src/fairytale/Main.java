package fairytale;

public class Main {

    public static void main(String[] args) {

        Human gran = new Human("Бабушка", Gender.FEMALE);
        Human grandpa = new Human("Дедушка", Gender.MALE);
        Bun bun = Bun.getInstance();

        gran.scratchSuseki();

        grandpa.setBunName("Колобок", bun);

    }
}
