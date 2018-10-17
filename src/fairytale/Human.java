package fairytale;

public class Human extends Creature {

    private String name;
    private boolean alive;

    public Human (String name){
        this.name = name;
        this.alive = true;
    }

    public void scratchSuseki (){
        Bun bun = Bun.getInstance();
        if (bun.isAlive() == true) {
            System.out.println("Колобок уже есть");
            return;
        } else{
        System.out.println("Бабка поскребла по сусекам, чего наскребла замешала, запекла");
        bun.makeAlive();
        System.out.println("Булка ожила? " + bun.isAlive());}
    }

    public void setBunName(String str, Bun bun){
        bun.setName(str);
        System.out.println("Булку назвали " + str);
    }

    @Override
    public String getName() {return this.name;}
}
