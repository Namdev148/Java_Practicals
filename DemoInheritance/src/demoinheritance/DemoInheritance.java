/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoinheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        Human human = new Human("Divyanka", 25, "Female");
        Dog dog = new Dog("Lucy", 3, "FeMale", "Labrador");
        Birds bird = new Birds("Parrot", 2, "Male");

        human.displayInfo();
        System.out.println();

        dog.displayInfo();
        System.out.println();

        bird.displayInfo();
    }
}

