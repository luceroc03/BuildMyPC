package BuildMyPC;

public class BuildMyPC {
    public static void main(String[] args) {

    Dimension dimension = new Dimension(18.35, 9.06, 17.83);
    Resolution resolution = new Resolution(90,50);
    Case theCase = new Case("4000D AIRFLOW ATX MidTower Case", "CORSAIR","Steel, Glass, Plastic",dimension);
    Monitor monitor = new Monitor("Acer", "Nitro XZ320Q P3bmiiphx 31.5", resolution, 31.5, 165);
    Motherboard motherboard = new Motherboard("ROG MAXIMUS Z790 HEROSKU:6523718", "ATX", "Socket LGA 1700",
            "Windows 10, Windows 11 Home",6,4,128);
    PC pc = new PC(theCase,monitor,motherboard);


        Computer buildMyPC= new Computer(theCase,dimension, monitor,motherboard,pc,resolution);

        System.out.println(buildMyPC);



    }
}