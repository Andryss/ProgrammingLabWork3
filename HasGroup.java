import java.util.List;

public interface HasGroup {
    List<Shorty> getGroup();
    void addShorty(Shorty shorty);
    void removeShorty(Shorty shorty);
}
