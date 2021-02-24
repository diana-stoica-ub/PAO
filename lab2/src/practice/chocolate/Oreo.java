package practice.chocolate;

public class Oreo extends ChocolateBox {

    private Float radius;
    private Float height;

    public Oreo() {
    }

    public Oreo(String flavour, String origin, Float radius, Float height) {
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public Float getVolume() {
        if (height != null && radius != null) {
            return height * radius * radius * (float)Math.PI;
        } else {
            System.out.println("Error - height or radius not initialised!");
            return 0f;
        }
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Oreo{" +
                "flavour=" + getFlavour() +
                "origin=" + getOrigin() +
                "radius=" + radius +
                ", height=" + height +
                ", volume=" + getVolume() +
                '}';
    }
}
