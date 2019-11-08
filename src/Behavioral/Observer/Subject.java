package Behavioral.Observer;

public interface Subject {
    // methods to register and unregister the object
    public void register(Observer obj);
    public void unregister(Observer obj);

    // method for notify observer
    public void notifyObservers();

    // method to get update from subject
    public Object getUpdate(Observer obj);
}
