package _01_algorithms._1_prime_or_not;
import javax.swing.JOptionPane;
public class prime_or_not {
public static void main(String[] args){
String numberString = JOptionPane.showInputDialog("Give me a number.");
Integer numberInteger = Integer.parseInt(numberString);
boolean prime = true;
for(Integer i = 2; i<numberInteger;i++){
if(numberInteger%i==0&&!(numberInteger==i)){
prime = false;
}  
}
if (!prime){
JOptionPane.showMessageDialog(null,"That number is not prime.");
}
else{
JOptionPane.showMessageDialog(null,"That number is prime.");
}
}
}