public class Person {
    //private String name;
    private Name name;
private int height;

//    public String getName() {
public Name getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

//    public void setName(String name) {
public void setName(Name name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    public Person(String name, int height) {
public Person(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + ", рост: " + height;
    }
}
