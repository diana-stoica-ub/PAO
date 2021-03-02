package practice.chocolate;

public class Merci extends ChocolateBox {

    private Float length;

    public Merci(){
    }

    @Override
    public Float getVolume() {
        return (float) Math.pow(length, 3);
    }

    public Merci(String flavour, String origin, Float length) {
        super(flavour, origin);
        this.length = length;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Merci{" +
                "length=" + length +
                '}';
    }
}
