package web.model;

public class Car {
    private String model;
    private int manufactureYear;
    private String vin;
    
    public Car(String model, int manufactureYear, String vin) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.vin = vin;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getManufactureYear() {
        return manufactureYear;
    }
    
    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    
    public String getVin() {
        return vin;
    }
    
    public void setVin(String vin) {
        this.vin = vin;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car[");
        sb.append("model=").append(model).append(", ");
        sb.append("manufactureYear=").append(manufactureYear).append(", ");
        sb.append("vin=").append(vin);
        sb.append("]");
        return sb.toString();
    }
}
