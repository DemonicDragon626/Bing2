import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = sc.next();
        Usuario usuario = new Usuario(nombreUsuario);
        DecimalFormat df = new DecimalFormat("#.00");


        while (true) {
            System.out.println("Que accion desea realizar? : " +
                    "\n1. Comenzar una partida de bingo" +
                    "\n2. Depositar" +
                    "\n3. Ver balance" +
                    "\n4. Salir" +
                    "\n ");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Juego juego = new Juego(usuario);
                    juego.StartGame(3);
                    List<Integer> manoUsuario = juego.getManoUsuario();
                    System.out.println("Random Numbers: " + manoUsuario);
                    juego.setResultado(manoUsuario);
                    System.out.println("Ganancias: Q" + df.format(juego.getResultado()));
                    usuario.actualizarBalance(juego.getResultado());
                    ;


                    break;

                case 2:
                    System.out.println("Ingrese caunto quiere depositar: ");
                    usuario.setDeposito(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("**************************************************"
                            + "\nBalance del Usuario: " + usuario.getNombUs()
                            + "\nBalance: Q" + df.format(usuario.getBalance()) + " ($" + df.format(usuario.getBalance() / 8) +")"
                            + "\nPrestamo: Q" + df.format(usuario.getPrestamo()) + " ($" + df.format(usuario.getPrestamo() / 8) + ")"
                            + "\nBalance Oficial: Q" + df.format(usuario.getTb()) + " ($" + df.format(usuario.getTb() / 8) + ")"
                            + "\n***************************************************");
                    break;

                case 4:
                    sc.close();
                    return;
            }
        }
    }
}