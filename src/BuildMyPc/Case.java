package BuildMyPc;


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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Case class: Press the power button - Pressed ");
    }





}
