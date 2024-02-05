package BuildMyPc;

import java.awt.*;

/**
 *
 */
public class Case {

    private String model;
    private String brand;
    private String material;
    private Dimension dimension;


    public Case(String model, String brand, String material, Dimension dimension){
        this.model = model;
        this.brand = brand;
        this.material =material;
        this.dimension = dimension;

    }

    public void pressPowerButton(){
        System.out.println("Case class: Press the power button - Pressed ");
    }





}






