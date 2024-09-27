package Lab2;

public class Triangle extends Polygon {
    Triangle() {
        super(3);
    }

    double base;
    double height;

    public double getArea() {
        return 0.5 * base * height;
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

    @Override
    public boolean equals(Object o)
    {
        if(o!=null && o instanceof Triangle)
        {
            Triangle t = (Triangle) o;
            return this.base == t.base && this.height == t.height;
        }
    }