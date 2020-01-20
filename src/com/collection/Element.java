package src.com.collection;

public class Element {

    protected String name;

    public Element(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public boolean equals(Object other) {
        if (other == null) return false;

        if (other.getClass() != this.getClass()) return false;

        if (this == other) return true;

        Element e = (Element) other;

        return e.name.equals(this.name);
    }
}
