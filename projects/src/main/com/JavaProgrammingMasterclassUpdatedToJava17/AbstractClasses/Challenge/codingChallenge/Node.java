package main.com.JavaProgrammingMasterclassUpdatedToJava17.AbstractClasses.Challenge.codingChallenge;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    void setNext(ListItem item) {
        this.rightLink=item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return this.leftLink=item;
    }

    @Override
    int compareTo(ListItem item) {
        if(item !=null){
            return ((String)super.getValue()).compareTo((String) item.getValue());
        }else{
            return -1;
        }
    }

}
