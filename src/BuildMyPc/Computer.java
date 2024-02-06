package BuildMyPC;

public class Computer {
    private Case theCase;
    private Dimension dimension;
    private Monitor monitor;
    private Motherboard motherboard;
    private PC pc;
    private Resolution resolution;

    public Computer(Case theCase, Dimension dimension, Monitor monitor, Motherboard motherboard, PC pc, Resolution resolution) {
        this.theCase = theCase;
        this.dimension = dimension;
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.pc = pc;
        this.resolution = resolution;
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public PC getPc() {
        return pc;
    }

    public void setPc(PC pc) {
        this.pc = pc;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }


}
