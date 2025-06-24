package record;

public record Name(String firstName, String lastName) {
    public Name{
        System.out.println("creating object");
    }

    public Name() {
        this("","");
    }
}
