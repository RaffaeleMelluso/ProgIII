package Lab2;

public class Parallelogram extends Polygon {
    
    private double base;
    private double height;
    Parallelogram() {
        super(4);
    }

    public double getArea() {
        return base * height;
    }

    public String[] describeAttributes() {
        String[] attributes = new String[2];
        attributes[0] = "Base: " + base;
        attributes[1] = "Height: " + height;
        return attributes;
    }

    public void setAttributes(double[] attributes) {
        this.base = attributes[0];
        this.height = attributes[1];    
    }

}
