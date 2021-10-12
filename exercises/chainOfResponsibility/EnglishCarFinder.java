package exercises.chainOfResponsibility;

public class EnglishCarFinder {
    private EnglishCarDatabase database = new EnglishCarDatabase();
    private CarFinder nextHandler;

    @Override
    public void setNext(CarFinder finder) {
        this.nextHandler = finder;
    }

    @Override
    public Car find(String licensePlate) {
        System.out.println("Checking english database...");

        for(Car car : database.getCars()) {
            if(car.licensePlate.equals(licensePlate)) {
                return car;
            }

            if(nextHandler != null) {
                return nextHandler.find(licensePlate);
            } else {
                return null;
            }
        }
    }


}
