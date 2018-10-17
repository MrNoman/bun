package fairytale;

public abstract class Creature implements Living{

    private boolean alive;

    public boolean isAlive() {return alive;}

    public void die() {this.alive = false;}

    public void doTalk(Creature living){
        System.out.println(this.getName() + " разговаривает с " + living.getName());
    }

    public void doTalk(Hunting hunter){
        System.out.println(this.getName() + " разговаривает с " + hunter.getName());
    }

    public void doLeave(Living living){
        System.out.println(this.getName() + " ушёл от " + living.getName());
    }

    public void doLeave(Hunting hunter){
        System.out.println(this.getName() + " ушёл от " + hunter.getName());
    }

    public void doComunicate(Creature creature2){
        this.doTalk(creature2);
        this.doLeave(creature2);
    }

    public void doComunicate(Hunting hunter){
        this.doTalk(hunter);
        if (hunter.getSpecies() == Species.FOX) {
            hunter.killCreature(this);
        } else {
            this.doLeave(hunter);
        }
    }
}
