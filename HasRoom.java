import java.util.List;

public interface HasRoom {
    Room[] getRooms();
    List<Room> getRooms(Locatable group);
}
