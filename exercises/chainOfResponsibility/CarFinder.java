package exercises.chainOfResponsibility;

public interface CarFinder {
    void setNext(CarFinder finder);
    Car find(String licensePlate);
}
