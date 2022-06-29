package designPatterns.observer;

public class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void unsubscribe(Subject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " - am primit mesajul: " + message);
    }
}
