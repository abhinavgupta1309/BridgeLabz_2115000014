class Animal{
String name;
int age;
Animal(String name, int age){
this.name = name;
this.age = age;
}
void makeSound(){
System.out.println("Animal Name : "+name+" Animal Age : "+age);
System.out.println("Animals have generic Sounds");
}
}
class Dog extends Animal{
Dog(String name, int age){
super(name, age);
}
void makeSound(){
System.out.println("Dog's Name : "+name+" Dog's Age : "+age);
System.out.println("Barks : Bhaw Bhaw");
}
}
class Cat extends Animal{
Cat(String name, int age){
super(name, age);
}
void makeSound(){
System.out.println("Cat's Name : "+name+" Cat's Age : "+age);
System.out.println("Meow Meow");
}
}
class Bird extends Animal{
Bird(String name, int age){
super(name, age);
}
void makeSound(){
System.out.println("Bird's Name : "+name+" Bird's Age : "+age);
System.out.println("Chirp Chirp");
}
}
public class AnimalSound{
public static void main(String args[]){
Animal dog = new Dog("Whiskey", 3);
Animal cat = new Cat("Bella", 2);
Animal bird = new Bird("Sweety", 1);

dog.makeSound();
cat.makeSound();
bird.makeSound();
}
}
