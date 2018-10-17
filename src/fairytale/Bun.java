package fairytale;

public class Bun extends Creature {
    private static Bun instance;
    private String name;
    private boolean alive;

    private Bun (){
        this.alive = false;
    }

    public static Bun getInstance(){
        if (instance == null) {
            instance = new Bun();
        }
        return instance;
    }

    public String getName(){return this.name;}
    public void setName(String str){this.name = str;}
}
