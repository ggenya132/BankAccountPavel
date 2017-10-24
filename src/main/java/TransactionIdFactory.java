public class TransactionIdFactory {
    private static long id;
    public  static  long getId(){
        id++;
        return id;

    }
}
