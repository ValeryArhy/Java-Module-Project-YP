import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        int hours = 24;

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите название машины №" + (i + 1) + ": ");
            String name = scanner.next();

            double speed = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Введите скорость машины №" + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    speed = scanner.nextDouble();
                    if (speed > 0 && speed <= 250) {
                        validInput = true;
                    } else {
                        System.out.println("Неправильная скорость. Скорость должна быть от 0 до 250. Попробуйте снова.");
                    }
                } else {
                    System.out.println("Ошибка: введено не число. Попробуйте снова.");
                    scanner.next();
                }
            }

            Car car = new Car(name, (int) speed);
            race.determineLeader(car, hours);
        }

        System.out.println("Самая быстрая машина: " + race.getCurrentLeader());
        scanner.close();
    }
}