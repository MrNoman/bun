package fairytale;

public class Human extends Creature {
    private Gender gender;
    private String name;
    private boolean alive;

    public Human (String name,Gender gender){
        this.name = name;
        this.gender = gender;
        this.alive = true;
    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    public void killCreature() {
        this.alive = false;
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

    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
