
public class Main {
    public static void main(String[] args) {
        /*Here is a sample Java code that includes three classes, inheritance,
        encapsulation, and polymorphism. */

        class Animal {
            private String name;
            private int age;

            public Animal(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void makeSound() {
                System.out.println("The animal makes a sound");
            }
        }

        class Dog extends Animal {
            public Dog(String name, int age) {
                super(name, age);
            }

            @Override
            public void makeSound() {
                System.out.println("The dog barks");
            }
        }

        class Cat extends Animal {
            public Cat(String name, int age) {
                super(name, age);
            }

            @Override
            public void makeSound() {
                System.out.println("The cat meows");
            }
        }
    }
}

        /* In this example, we have three classes: `Animal`, `Dog`, and `Cat`.
        The `Dog` and `Cat` classes inherit from the `Animal` class. The `Animal` class has two private fields: `name` and `age`. It also has a constructor that takes in a name and an age. The `Dog` and `Cat` classes have their own constructors that call the constructor of the parent class using the `super()` method.
         */

        /*The `Animal` class has a method called `makeSound()`.
        This method is overridden in both the `Dog` and `Cat` classes to produce different sounds. This is an example of polymorphism.
        */