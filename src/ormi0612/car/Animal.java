package ormi0612.car;

import ormi0612.car.example.Camel;
import ormi0612.car.example.Sonata;

public class Animal {
    protected String name;
    protected String gender;

    public Animal(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Camel camel = new Camel("낙타타", "양성");
        System.out.println(camel.name);


    }
}
