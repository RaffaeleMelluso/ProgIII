package Lab2;

public class Rectangle extends Parallelogram {
    Rectangle() {
        super();
    }
    
    @Override
    public void setAttributes(double[] attributes) {
        
    }
    @Override
    public double getArea() {
        return super.getArea();
    }
    @Override
    public boolean equals(Object o)
    {
        if(o!=null && o instanceof Rectangle)
        {
            Rectangle r = (Rectangle) o;
            return this.base == r.base && this.height == r.height;
        }
        return false;
    }


    
}
