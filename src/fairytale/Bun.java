package fairytale;

public class Bun extends Creature{
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

    @Override
    public boolean isAlive() {
        return (alive) ;
    }

    @Override
    public void killCreature() {this.alive = false;}
    public void  makeAlive () {this.alive = true;}
    public void getName(){System.out.println(this.name);}
    public void setName(String str){this.name = str;}

}
