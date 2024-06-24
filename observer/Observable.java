package observer;

/**
 * Observable
 */
public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyobservers();
    void setData(boolean setState);
    String getData();
}
