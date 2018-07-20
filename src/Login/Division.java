package Login;

/**
 *
 * @author ErickBSG
 */
public class Division {

    static int numerador = 20;
    static Integer denominador = null;
    static double division;

    public static void main(String[] args) {
        System.out.println("Antes De La Division");

        try {
            division = numerador / denominador;
        } catch (ArithmeticException ex) {
            division = 0.0;
            System.out.println("Error: " + ex.getMessage());
        }catch (NullPointerException np) {
            division = 1;
            System.out.println("Error: " + np.getMessage());
        }
            finally{
            System.out.println("Division: " + division);
            System.out.println("Despues De La Division");
        }
    }

}
