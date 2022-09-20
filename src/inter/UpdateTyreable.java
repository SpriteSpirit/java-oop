package inter;

public interface UpdateTyreable {
    void updateTyre();
    default void updateTyre(int i) {
        System.out.println("Changing the tire: " + i);
    }
}
