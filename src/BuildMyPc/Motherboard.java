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




}
