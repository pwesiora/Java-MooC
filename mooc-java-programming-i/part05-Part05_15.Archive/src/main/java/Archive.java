public class Archive {

    private String name;
    private String identifier;

    public Archive(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedItem = (Archive) compared;

        return (this.identifier.equals(comparedItem.getIdentifier()));

    }
@Override
 public String toString() {
        return this.identifier + ": " + this.name;
    }
}
