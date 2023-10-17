package Animal_Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken sounds";
    }
    @Override
    public String howtoEat(){
        return "Fried it duh";
    }
}
