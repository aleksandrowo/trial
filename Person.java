public class Person {
    String name;
    Pet pet;

    public Person(String name) {
        this.name = name;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
