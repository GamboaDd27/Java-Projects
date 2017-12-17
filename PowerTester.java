//Tester class
public class PowerTester {
public static void main(String[]args) {//main method
PowerGenerator myGenerator= new PowerGenerator(10);//creates a power generator of 10
for(int i=1; i<=12; i++) {//loops twelve(12) times
System.out.println(myGenerator.nextPower());//will print powers from 10^0 to 10^11
}}
}
