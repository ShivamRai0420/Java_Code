public class Static_Keyword {
    public static void main(String args[]){
        Students s1=new Students();
        s1.schoolame="jvm";
    
        Student s2=new Student();
        System.out.println(s1.schoolame); 
    }
    
}
class Students{
    String name;
        int roll;
        static String schoolame;

        void setname(String name){
            this.name=name;
        }
        String getname(){
            return this.name;
        }
    }
