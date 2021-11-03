public class Rocket extends Location {
    public static final String BASENAME = "Ракета";

    public Rocket(String name, Room ... rooms) {
        super(name, rooms);
    }

    public Rocket(Room ... rooms) {
        this(BASENAME, rooms);
    }

    @Override
    public String toString() {
        return "Ракета \"" + getName() + "\"";
    }
}
