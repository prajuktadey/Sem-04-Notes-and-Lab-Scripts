public class quest2 {
    public static void main(String[] args) {
        try{
            throw new NegativeArraySizeException();
//            throw new ArrayIndexOutOfBoundsException();
        }
        catch(NegativeArraySizeException e){
            System.out.println("First exception caught");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Second exception caught");
        }
    }
}