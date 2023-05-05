public class Pilot extends Employee implements  CheckPilot{

    public void setCompass(boolean compass) {
        this.compass = true;
    }

    private boolean compass;

    public Pilot(String name, Type type) {
        super(name, type);
        this.compass=false;
    }

    public boolean hasCompass() {
        return compass;
    }
}
