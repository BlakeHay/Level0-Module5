package _03_method_writing._1_obedient_robot;
import org.jointheleague.graphical.robot.Robot;
public class _1_obedient_robot {
public static void main(String[] args) {
Robot	rob = new Robot();
rob.setX(300);
rob.setY(300);
rob.penDown();
rob.setSpeed(5);
}
public static void draw() {
    System.out.println("Method1");
}
}