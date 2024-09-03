public class Civic extends Cars{

    private String name;

    public Civic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Civic{" +
                "name='" + name + '\'' +
                '}';
    }
}
