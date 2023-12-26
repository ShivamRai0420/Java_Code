
public class Class_Addition {
    public static void main(String args[]){
        Addition obj=new Addition();
        obj.a=10;
        obj.b=20;
        obj.add();
        System.out.println(obj.total);
    }  
}
class Addition{
    int a,b,total;
    void add(){
        total=a+b;
    }
}
