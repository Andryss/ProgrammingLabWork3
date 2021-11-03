public interface Locatable extends HasGroup, HasLocation {
    void goTo(AbleToLocate location);
    void goOut();
}
