package Lab2;

public abstract class Polygon {
    private int vertices;

    public Polygon(int vertices) {
        this.vertices = vertices;
    }

    public int getNumVertices(Polygon polygon) {
        return this.vertices;
    }
    abstract double getArea();
    abstract String[] describeAttributes();
    abstract void setAttributes(double[] attributes);




}
