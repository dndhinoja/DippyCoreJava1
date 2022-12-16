package dippy.com.nd.SortingComparabletor;

import java.util.Objects;

public class ColourComparable implements Comparable<ColourComparable>{

    int colourId;
    String colourName;
    int colourCode;

    public ColourComparable(int colourId, String colourName, int colourCode) {
        this.colourId = colourId;
        this.colourName = colourName;
        this.colourCode = colourCode;
    }

    public int getColourId() {
        return colourId;
    }

    public String getColourName() {
        return colourName;
    }

    public int getColourCode() {
        return colourCode;
    }

    public void setColourId(int colourId) {
        this.colourId = colourId;
    }

    public void setColourName(String colourName) {
        this.colourName = colourName;
    }

    public void setColourCode(int colourCode) {
        this.colourCode = colourCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColourComparable that = (ColourComparable) o;
        return colourId == that.colourId && colourCode == that.colourCode && colourName.equals(that.colourName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colourId, colourName, colourCode);
    }

    @Override
    public int compareTo(ColourComparable o) {
        return this.colourName.compareTo(o.colourName);
    }
}
