
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }

        Item comparedObj = (Item) obj;

        if (this.name.equals(comparedObj.getName())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17; // Starting with a non-zero constant.
        result = 31 * result + (name != null ? name.hashCode() : 0); // Hash for the 'name' field.
        return result;
    }

}
