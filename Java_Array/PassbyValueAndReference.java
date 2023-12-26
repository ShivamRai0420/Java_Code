public class PassbyValueAndReference {
    //In arrays always pass by reference.
    //Reference= pass actual values, reflect/change in main fun and calling fun.
    //Argument/value= pass copy values, do not reflect/change in main fun and calling fun.

    public static void update(int marks[],int notchangeable){
        notchangeable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int notchangeable=5;
        update(marks,notchangeable);
        //For printing
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println(notchangeable);
    }
}
