package BuildMyPc;


/**
 * ASUS - ROG MAXIMUS Z790 HERO (Socket LGA 1700) USB 3.2 Intel Motherboard
 * Model:ROG MAXIMUS Z790 HEROSKU:6523718
 * Form Factor: ATX
 * Processor Socket: Socket LGA 1700
 * Operating System Compatibility: Windows 10, Windows 11 Home
 * Number Of PCI Slots: 6
 * Number Of Memory Slots: 4
 * Maximum Memory Supported: 128 gigabytes
 */

public class Motherboard {

    private String model;
    private String formFactor;
    private String processorSocket;
    private String operatingSystem;
    private int pciSlots;
    private int memorySlots;
    private int maxMemorySupported;

    public Motherboard(String model, String formFactor, String processorSocket, String operatingSystem, int pciSlots, int memorySlots, int maxMemorySupported) {
        this.model = model;
        this.formFactor = formFactor;
        this.processorSocket = processorSocket;
        this.operatingSystem = operatingSystem;
        this.pciSlots = pciSlots;
        this.memorySlots = memorySlots;
        this.maxMemorySupported = maxMemorySupported;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getProcessorSocket() {
        return processorSocket;
    }

    public void setProcessorSocket(String processorSocket) {
        this.processorSocket = processorSocket;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPciSlots() {
        return pciSlots;
    }

    public void setPciSlots(int pciSlots) {
        this.pciSlots = pciSlots;
    }

    public int getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(int memorySlots) {
        this.memorySlots = memorySlots;
    }

    public int getMaxMemorySupported() {
        return maxMemorySupported;
    }

    public void setMaxMemorySupported(int maxMemorySupported) {
        this.maxMemorySupported = maxMemorySupported;
    }
}
