package main.com.JavaProgrammingMasterclassUpdatedToJava17.Inheritance.textFormatting;
public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height){
        super(radius);
        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        double volume=getArea()*height;
        return volume;
    }
}