package _03_method_writing._1_obedient_robot;
import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class _1_obedient_robot {
static Robot rob = new Robot();
public static void main(String[] args) {
setup();
String shape = JOptionPane.showOptionDialog("What shape would you like me to draw?", ("triangle", "square", "circle"));
String color = JOptionPane.showInputDialog("What color would you like me to use?(red, blue, or yellow)");
if(color.equalsIgnoreCase("red")){
rob.setPenColor(Color.RED);
}
if(color.equalsIgnoreCase("blue")){
rob.setPenColor(Color.BLUE);
}
if(color.equalsIgnoreCase("yellow")){
rob.setPenColor(Color.YELLOW);
}
if(shape.equalsIgnoreCase("square")){
drawSquare();
}
if(shape.equalsIgnoreCase("circle")){
drawCircle();
}
if(shape.equalsIgnoreCase("triangle")){
drawTriangle();
}
}
public static void setup() {  
rob.setX(300);
rob.setY(300);
rob.penDown();
rob.setSpeed(10);
rob.miniaturize();
}
public static void drawSquare() {
for(int i = 0; i < 4; i++){
rob.move(100);
rob.turn(90);
}
}
public static void drawTriangle() {
for(int i = 0; i < 3; i++){
rob.move(100);
rob.turn(120);
}
}
public static void drawCircle() {
for(int i = 0; i < 360; i++){
rob.move(10);
rob.turn(1);
}
}
}