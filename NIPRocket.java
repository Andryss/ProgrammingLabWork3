public class NIPRocket extends Rocket {
    private static final Room[] placement = new BigRoom[1];
    private static final String BASENAME = "Ракета НИП";

    static {
        for (int i = 0; i < placement.length; i++) {
            placement[i] = new BigRoom();
        }
    }

    public NIPRocket(String name) {
        super(name, placement);
    }

    public NIPRocket() {
        super(BASENAME, placement);
    }

    @Override
    public String toString() {
        return "Ракета НИП \"" + getName() + "\"";
    }
}
