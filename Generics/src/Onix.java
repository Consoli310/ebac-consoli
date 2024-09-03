public class Onix extends Cars{

    private String name;

    public Onix(String name) {
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
        return "Onix{" +
                "name='" + name + '\'' +
                '}';
    }
}
