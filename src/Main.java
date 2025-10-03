import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int simulationTime = 10;
        int numberOfHumans = 5;

        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < numberOfHumans; i++) {
            humans.add(new Human("ID" + i, 20 + i, 1.0 + i * 0.5));
        }


        for (int time = 0; time < simulationTime; time++) {
            System.out.println("Time: " + time + "s");
            for (Human human : humans) {
                human.move();
                System.out.printf("Human %s: (%.2f, %.2f)\n", human.getEMD(), human.getX(), human.getY());
            }
            System.out.println("---");
        }
    }
}
