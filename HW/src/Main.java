import java.util.Arrays;
// абстрактный класс следует использовать, когда есть поля, а когда поля одинаковы, то лучше использовать интерфейс
public class Main {
    public static void main(String[] args) {
        /*Cat cat1 = new Cat();  // слева - название типа, имя переменной типа, справа - объект
        Animal cat2 = new Cat();  // можно создавать и так и так
        cat1.run();
        //cat2.run(); - мы не можем вызвать метод run, т.к. он находится только в Cat - это полиморфизм*/
        Cat cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();

        voice(cat);
        voice(dog);
        voice(cow);
        cat.run();

        Animal[] animals = {
                cat,
                dog,
                cow
        };
        for (Animal animal: animals)
        {
            System.out.println(animal.voice());
        }

    }

    private static void voice(Animal animal)
    {
        animal.voice();
    }

}