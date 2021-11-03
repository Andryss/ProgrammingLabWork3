public class FISRocket extends Rocket {
    private static final Room[] placement = new SmallRoom[12];
    private static final String BASENAME = "Ракета ФИС";

    static {
        for (int i = 0; i < placement.length; i++) {
            placement[i] = new SmallRoom();
        }
    }

    public FISRocket(String name) {
        super(name, placement);
    }

    public FISRocket() {
        super(BASENAME, placement);
    }

    @Override
    public String toString() {
        return "Ракета ФИС \"" + getName() + "\"";
    }
}
