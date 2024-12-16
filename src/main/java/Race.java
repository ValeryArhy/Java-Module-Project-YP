public class Race {
    private String currentLeader;
    private int currentMaxSpeed;

    public void determineLeader(Car car, int hours) {
        int distance = (int) (car.getSpeed() * hours);
        if (distance > currentMaxSpeed) {
            currentMaxSpeed = distance;
            currentLeader = car.getName();
        }
    }

    public String getCurrentLeader() {
        return currentLeader;
    }
}