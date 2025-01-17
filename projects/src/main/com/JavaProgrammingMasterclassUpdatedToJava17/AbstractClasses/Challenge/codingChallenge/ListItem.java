package main.com.JavaProgrammingMasterclassUpdatedToJava17.AbstractClasses.Challenge.codingChallenge;

public abstract class ListItem {
    // write code here
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value){
        this.value=value;
    }

    abstract ListItem next();
    abstract void setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value=value;
    }
}
