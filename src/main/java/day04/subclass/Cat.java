package day04.subclass;

public class Cat {
    private String name;

    public Cat() {
        System.out.println("Cat Constructor");;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasWhiskers() {
        // Add meaningful logic to check if the cat has whiskers
        return true;
    }

    protected String favoriteSnack() {
        return "Mice";  // Allow subclasses to override with their favorite snack
    }

    public int getLives() {
        return 1;  // Reflecting that cats have one life
    }
}
