package exercises.observer;

import java.util.ArrayList;
import java.util.List;

public class ErrorBroadcaster {
    private List<ErrorObserver> observers = new ArrayList<>();

    public void subscribe(ErrorObserver observer) {

        this.observers.add(observer);
    }

    public void unsubscribe(ErrorObserver observer) {

        this.observers.remove(observer);
    }

    public void submitError(Error error) {
        for (ErrorObserver observer : observers) {
            observer.notify(error);
        }
    }
}
