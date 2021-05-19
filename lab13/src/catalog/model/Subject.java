package catalog.model;

import java.util.Objects;

public class Subject implements CSVCompatible {

    private String name;
    private Integer creditPoints;

    public Subject(String name, Integer creditPoints) {
        this.name = name;
        this.creditPoints = creditPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(Integer creditPoints) {
        this.creditPoints = creditPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return name.equals(subject.name) &&
                creditPoints.equals(subject.creditPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creditPoints);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subject{");
        sb.append("name='").append(name).append('\'');
        sb.append(", creditPoints=").append(creditPoints);
        sb.append('}');
        return sb.toString();
    }
}
