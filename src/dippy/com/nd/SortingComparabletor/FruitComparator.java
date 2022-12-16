package dippy.com.nd.SortingComparabletor;

public class FruitComparator {

    private int id;
    private String fruitName;
    private String colour;

    public FruitComparator(int id, String fruitName, String colour) {
        this.id = id;
        this.fruitName = fruitName;
        this.colour = colour;
    }

    public int getId() {

        return id;
    }

    public String getFruitName() {

        return fruitName;
    }

    public String getColour() {

        return colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FruitComparator that = (FruitComparator) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
