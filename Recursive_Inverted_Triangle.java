public class Recursive_Inverted_Triangle {
    public static void main(String[] args) {
        Triangle(5,0);

    }
    public static void Triangle(int r, int c){
        if(r == 0){
            return;
        }
        if (c < r){
            System.out.print(" * ");
            Triangle(r,c+1);
        }
        else {
            System.out.println(" ");
            Triangle(r-1,0);
        }
    }
}
