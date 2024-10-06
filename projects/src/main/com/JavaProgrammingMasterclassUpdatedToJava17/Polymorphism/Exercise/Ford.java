package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Exercise;

public class Ford extends Car{
    private String name;
    private int cylinders;

    public Ford(int cylinders,String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}