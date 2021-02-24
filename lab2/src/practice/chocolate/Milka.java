package practice.chocolate;

import java.util.Objects;

public class Milka extends ChocolateBox {

    private Float length;
    private Float width;
    private Float height;

    public Milka() {

    }

    public Milka(String flavour, String origin, Float length, Float width, Float height){
        super(flavour, origin);
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public Float getVolume() {
        return length * height * width;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "Milka " + width + " " + height + " " + length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Milka milka = (Milka) o;
        return Objects.equals(length, milka.length) &&
                Objects.equals(width, milka.width) &&
                Objects.equals(height, milka.height) &&
                Objects.equals(getFlavour(), milka.getFlavour()) &&
                Objects.equals(getOrigin(), milka.getOrigin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, height);
    }
}
