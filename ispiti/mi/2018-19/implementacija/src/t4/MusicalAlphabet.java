package t4;

public class MusicalAlphabet {
    public static void main(String[] args) {
        String [] scale = new String[] {"c", "e", "55"};
        try {
            for (int i=scale.length; i > 0; i--) {
                try {
                    int x = Integer.parseInt(scale[scale.length - i + 1]);
                    try {
                        System.out.format("%d is number%n", x);
                        throw new IllegalMusicalAlphabetException("Illegal.");
                    }
                    catch (IllegalMusicalAlphabetException exc) {
                        System.out.println(exc.getMessage()); // ispisuje String koji je
                        // bio predan u konstruktoru iznimke
                    }
                    finally {
                        System.out.println("inner finally");
                    }
                }
                catch(IndexOutOfBoundsException exc){
                    System.out.println("Error: 1");
                    throw new IllegalMusicalAlphabetException("Error: 4");
                }
                catch(NumberFormatException exc){
                    System.out.println("Error: 2");
                }
                catch(NullPointerException exc){
                    System.out.println("Error: 3");
                }
                finally {
                    System.out.println("outer finally");
                }
            }
        }
        catch (IllegalMusicalAlphabetException exc) {
            // TO-DO
        }
    }
}
/*
Output:

Error: 2
outer finally
55 is a number
Illegal.
inner finally
outer finally ???
Error: 1
outer finally

 */