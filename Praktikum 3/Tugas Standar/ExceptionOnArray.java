/*
    Nama        : Mohamad Faisal Rizki
    NIM         : 24060122130068
    Nama File   : ExceptionOnArray.java
    Deskripsi   : File Exceptions program ExceptionOnArray
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean up code...");
        }
    }
}
