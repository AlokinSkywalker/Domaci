public abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract double circumference();
    public abstract double area();
    @Override
    public String toString() {
        String spacer ="-----------------";
        return "Shape: " + name + "\n" + "Circumference: " + circumference() + "\n" + "Area: " + area() + "\n" + spacer; // TODO: Implement me
    }

}