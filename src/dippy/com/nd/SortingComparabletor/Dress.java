package dippy.com.nd.SortingComparabletor;

public class Dress {

    int dressId;
    String dressName;
    String dressColor;

    public Dress(int dressId, String dressName, String dressColor) {
        this.dressId = dressId;
        this.dressName = dressName;
        this.dressColor = dressColor;
    }

    public int getDressId() {
        return dressId;
    }

    public String getDressName() {
        return dressName;
    }

    public String getDressColor() {
        return dressColor;
    }

    public void setDressId(int dressId) {
        this.dressId = dressId;
    }

    public void setDressName(String dressName) {
        this.dressName = dressName;
    }

    public void setDressColor(String dressColor) {
        this.dressColor = dressColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dress dress = (Dress) o;

        if (dressId != dress.dressId) return false;
        if (!dressName.equals(dress.dressName)) return false;
        return dressColor.equals(dress.dressColor);
    }

    @Override
    public int hashCode() {
        int result = dressId;
        result = 31 * result + dressName.hashCode();
        result = 31 * result + dressColor.hashCode();
        return result;
    }
}
