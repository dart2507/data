class ExceptionHandling{
    public static void main(String[] args){

        //case study 1
        System.out.println("Problem 1");
        try {
            int answer = 10/0;
        } 
        catch ( ArithmeticException e) {
            System.out.println("Error has been seen");
            System.out.println("Arithmetic Exception Occured");
        }

        //case study 2
        System.out.println("Problem 2");
        try {
            int[] array={34,54,2,44,25,66};
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occured");
            System.out.println("Exception is ArrayIndexOutofBoundsException");
        }

        //case study 3
        System.out.println("Problem 3");
        try {
            String name = null;
            System.out.println(name.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Exception Occured ");
            System.out.println("NullPointerException has been found");
        }

        //case study 4
        System.out.println("Problem 4");
        try {
            int answer = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled");
        }
        finally{
            System.out.println("Message from finally block displayed");
        }

        //case study 5
        System.out.println("Problem 5");
        try {
            System.out.println("No exception in try block");
        } 
        catch (Exception e) {
            System.out.println("Exception caught ");
        }
        finally{
            System.out.println("finally block executed");
        }
    }
}