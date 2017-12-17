
//PowerGenerator SubClass
public class PowerGenerator{
public PowerGenerator(int aFactor) { //public constructor
factor=aFactor;//sets the private field to the value of the parameter the user gave
}
public double nextPower() { //method
count++;//increases the power count
return Math.pow(factor, count);
}
private int count=-1;//powers start at zero(0), this makes the nextPower() method do such
private int factor;}
