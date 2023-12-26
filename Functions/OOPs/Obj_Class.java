// package OOPs;

public class Obj_Class {
    public static void main(String args[]){
        //Object of Pen
        Pen p1=new Pen();       //Pen()=constructor

        p1.setColor("Blue");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());    //Getter

        p1.setTip(5);
        // System.out.println(p1.tip);
        System.out.println(p1.getTip());

    }
}
class Pen{
    private String color;
    private int tip;
    //this :- used to refer to current obj.
    //Getter:- TO RETURN THE VALUE
    String getColor(){
        return this.color;
    } .

    int getTip(){
        return this.tip;
    }

    //Setter:- TO MODIFY VALUE
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

