package BuildMyPc;


public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;


    public PC(Case theCase, Monitor monitor, Motherboard motherboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public Case getTheCase(){
        return theCase;
    }

    public Monitor getMonitor(){
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
