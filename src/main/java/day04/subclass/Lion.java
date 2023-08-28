package day04.subclass;

public class Lion extends Cat {
    public Lion() {
        System.out.println("Lion constructor");
    }

    @Override
    protected String favoriteSnack() {
        return "Antelope";
    }
}
