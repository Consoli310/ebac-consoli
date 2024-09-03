public class Honda extends Cars{

    private String name;

    public Honda(String name) {
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
        return "Honda{" +
                "name='" + name + '\'' +
                '}';
    }
}
