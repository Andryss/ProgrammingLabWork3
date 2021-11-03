public class Normal extends Shorty {

    public Normal(String name) {
        super(name);
    }

    @Override
    public void spendFreeTime() {
        if (Math.random() > 0.5) {
            cleanRoom();
        } else if (Math.random() > 0.2) {
            trashRoom();
        }
    }

}
