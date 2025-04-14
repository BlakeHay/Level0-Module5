package _01_algorithms._2_fibonacci;
public class fibonaci {
public static void main(String[] args){
Integer num1Integer = 0;
Integer num2Integer = 1;
for(Integer i = 1; i<=46;i++){
if(i%2==0){
num1Integer = num1Integer+num2Integer;
System.out.println(num1Integer);
}
else{
num2Integer = num1Integer+num2Integer;
System.out.println(num2Integer);
}
}
}
}


