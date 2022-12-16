package dippy.com.nd.SortingComparabletor;

public class Furniture implements  Comparable<Furniture>{

    String name;
    int size;

    public Furniture(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Furniture o) {
        return this.getName().compareTo(o.getName());
    }
}
