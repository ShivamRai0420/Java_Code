public class PatternAdvance {
    public static void main(String args[]){
        int n=5;
        int val=1;

        // Hollow rectangle
        System.out.println(" Hollow rectangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                }               
            }
            System.out.println();
        }

        //Half Pyramid with no.
        System.out.println("Half Pyramid with no.");
            for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=1&&j<=(n-i+1)){
                    System.out.print(" "+j);
                }
                else{

                    System.out.print(" ");
                }               
            }
            System.out.println();
        }

        //Floyd's Triangle.
        System.out.println("Floyd's Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+val);
                val++;             
            }
            System.out.println();
        }
        //0-1 Triangle.
        System.out.println("0-1 Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        //Rhombus
        System.out.println("Rhombus");
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");   
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");   
            }
            System.out.println();
        }

        //Pyramid ()
        System.out.println(" Pyramid");
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
