public class ObjectComparisonExample {
    public static void main(String[] args) {
        // creating constructor of the Double class
        @SuppressWarnings("removal")
        Double x = new Double(123.45555);
        // creating constructor of the Long class
        @SuppressWarnings("removal")
        Long y = new Long(9887544);
        // invoking the equals() method
        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(123.45555));
    }
}