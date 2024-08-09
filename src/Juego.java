import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class Juego {
    private Random random = new Random();
    private List<Integer> mU;
    private Usuario usuario;
    private final int costo = 12;
    private double resultado;

    public Juego(Usuario usuario) {
        this.usuario = usuario;
        this.mU = new ArrayList<>();
    }

    private int NR() {
        return random.nextInt(100,1001);
    }


    public List<Integer> getManoUsuario() {
        return new ArrayList<>(mU);
    }

    public void StartGame(int numberOfRandomNumbers) {
        if (!usuario.puedeJugar(costo)) {
            System.out.println("No tienes suficiente saldo para jugar. Necesitas al menos Q12 (incluyendo préstamo).");
            resultado = 0;
            return;
        }


        usuario.actualizarBalance(-costo);

        mU.clear();
        for (int i = 0; i < numberOfRandomNumbers; i++) {
            int num = NR();
            mU.add(num);
        }
    }
    public boolean isEven(int num) {
        return (num % 2==0);
    }

    public double getResultado() {return resultado;}

    public void setResultado(List lista) {
        if (isEven((Integer) lista.getFirst()) && isEven((Integer) lista.get(1))){
            if((Integer)lista.getFirst() > 700 && (Integer) lista.get(1)>700){
                resultado = ((Integer)lista.getFirst() + (Integer) lista.get(1))*0.1;
            } else if ((Integer)lista.getFirst() < 700 && (Integer) lista.get(1)<700 && (Integer) lista.getFirst() > 500 && (Integer) lista.get(1)>500) {
                resultado = ((Integer)lista.getFirst() + (Integer) lista.get(1))*0.2;
            } else if ((Integer)lista.getFirst() > 500 || (Integer) lista.get(1)>500) {
                resultado = ((Integer)lista.getFirst() + (Integer) lista.get(1))*0.15;
            } else if ((Integer)lista.getFirst() < 500 && (Integer) lista.get(1)<500) {
                resultado = ((Integer)lista.getFirst() + (Integer) lista.get(1))*0.25;
            }else {resultado=0;}
        }
        else if (isEven((Integer) lista.getFirst()) && isEven((Integer) lista.getLast())){
            if((Integer)lista.getFirst() > 700 && (Integer) lista.getLast()>700){
                resultado = ((Integer)lista.getFirst() + (Integer) lista.getLast())*0.1;
            } else if ((Integer)lista.getFirst() < 700 && (Integer) lista.getLast()<700 && (Integer) lista.getFirst() > 500 && (Integer) lista.getLast()>500) {
                resultado = ((Integer)lista.getFirst() + (Integer) lista.getLast())*0.2;
            } else if ((Integer)lista.getFirst() > 500 || (Integer) lista.getLast()>500) {
                resultado = ((Integer)lista.getFirst() + (Integer) lista.getLast())*0.15;
            } else if ((Integer)lista.getFirst() < 500 && (Integer) lista.getLast()<500) {
                resultado = ((Integer)lista.getFirst() + (Integer) lista.getLast())*0.25;
            }else {resultado=0;}
        }
        else if (isEven((Integer) lista.getLast()) && isEven((Integer) lista.get(1))){
            if((Integer)lista.getLast() > 700 && (Integer) lista.get(1)>700){
                resultado = ((Integer)lista.getLast() + (Integer) lista.get(1))*0.1;
            } else if ((Integer)lista.getLast() < 700 && (Integer) lista.get(1)<700 && (Integer) lista.getLast() > 500 && (Integer) lista.get(1)>500) {
                resultado = ((Integer)lista.getLast() + (Integer) lista.get(1))*0.2;
            } else if ((Integer)lista.getLast() > 500 || (Integer) lista.get(1)>500) {
                resultado = ((Integer)lista.getLast() + (Integer) lista.get(1))*0.15;
            } else if ((Integer)lista.getLast() < 500 && (Integer) lista.get(1)<500) {
                resultado = ((Integer)lista.getLast() + (Integer) lista.get(1))*0.25;
            }else {resultado=0;}
        }
        else {resultado=0;}}


}

