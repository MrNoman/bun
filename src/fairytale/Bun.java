package fairytale;

public class Bun extends Creature {
    private volatile static Bun instance;
    private String name;
    private boolean alive;

    private Bun (){}

    public static Bun getInstance(){
        if (instance == null) {
            synchronized (Bun.class) {
                if (instance == null) {
                    instance = new Bun();
                }
            }
        }
        return instance;
    }

    public String getName(){return this.name;}
    public void setName(String str){this.name = str;}
}
