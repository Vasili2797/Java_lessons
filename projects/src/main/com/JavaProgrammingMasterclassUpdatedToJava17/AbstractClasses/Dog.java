package main.com.JavaProgrammingMasterclassUpdatedToJava17.AbstractClasses;

public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(type+ " walking");
        }else{
            System.out.println(type+ " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType()+" shed hair all year long");
    }

    @Override
    public void makeNoise() {
        if(type=="Wolf"){
            System.out.print("Howling! ");
        }else{
            System.out.print("Woof! ");
        }
    }


}
