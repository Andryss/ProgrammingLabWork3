public class Cook extends Shorty {

    public Cook(String name) {
        super(name);
    }

    private Food cooking() {
        return Food.generateRandomFood();
    }

    private void feedOnly(Shorty shorty) {
        Food food = cooking();
        shorty.eat(food);
    }

    public void feedAllGroup() {
        if (hasGroup() && getGroup().getGroup().size() > 1) {
            System.out.println(this + " готовит еду на всю свою группу");
            for (Shorty shorty : getGroup().getGroup()) {
                feedOnly(shorty);
            }
            System.out.println();
        }
    }

    @Override
    public void spendFreeTime() {
        if (Math.random() > 0.95) {
            feedAllGroup();
        } else if (Math.random() > 0.6) {
            feedOnly(this);
        }
    }

    @Override
    public String toString() {
        return "Коротышка-повар " + getName();
    }
}
