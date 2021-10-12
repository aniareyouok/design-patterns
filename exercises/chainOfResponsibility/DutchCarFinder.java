package exercises.chainOfResponsibility;

public class DutchCarFinder implements CarFinder {
    private DutchCarDatabase database = new DutchCarDatabase();
    private CarFinder nextHandler;

    public void setNext(CarFinder finder) {
        this.nextHandler = finder;
    }

    public Car find(String licensePlate) {
        System.out.println("Checking dutch database...");

        for (Car car : database.getCars()) {
            if (car.licensePlate.equals(licensePlate)) {
                return car;
            }
        }

        if (nextHandler != null) {
            return nextHandler.find(licensePlate);
        } else {
            return null;
        }
    }
}
