import java.util.Objects;

public abstract class Shorty {
    private final String name;
    private Locatable group;
    private Room room;

    public Shorty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Locatable getGroup() {
        return group;
    }

    public Room getRoom() {
        return room;
    }

    public boolean hasGroup() {
        return group != null;
    }

    public boolean hasRoom() {
        return room != null;
    }

    public void say(String text) {
        System.out.println(name + " говорит: " + text + "\n");
    }

    public void eat(Food food) {
        System.out.println(name + " съел: " + food);
    }

    public void cleanRoom() {
        if (hasRoom()) {
            room.cleanRoom();
            System.out.println(this + " прибрался в комнате");
        }
    }

    public void trashRoom() {
        if (hasRoom()) {
            room.trashRoom();
            System.out.println(this + " раскидал мусор по комнате");
        }
    }

    void setRoom(Room room) {
        this.room = room;
    }

    void setGroup(GroupOfShorties group) {
        this.group = group;
    }

    public abstract void spendFreeTime();

    @Override
    public String toString() {
        return "Коротышка " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shorty shorty = (Shorty) o;
        return name.equals(shorty.name) && group.equals(shorty.group) && room.equals(shorty.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, room);
    }
}
