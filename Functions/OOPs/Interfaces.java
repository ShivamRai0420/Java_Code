public class Interfaces {
    //Total Abstraction
    public static void main(String args[]){
        Queen obj= new Queen();
        obj.moves();
    }
}

interface chessPlayer{
    void moves();                   //By default public and abstract.

}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all direction)");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right, diagonal 1 step");
    }
}
