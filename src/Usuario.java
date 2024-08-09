public class Usuario{
    private String NombUs;
    private double balance;
    private double prestamo;
    private double tb;
    private double deposito;

    public Usuario(String nombUs) {
        this.NombUs = nombUs;
        this.deposito = 0;
        this.balance = deposito;
        this.prestamo = 48 - deposito;
    }

    public boolean puedeComprar() {
        return balance >= 12.00;
    }

    public void comprar() {
        if (puedeComprar()) {
            balance -= 12.00;
        } else {
            System.out.println("Saldo insuficiente para comprar números.");
        }
    }

    public void setNombUs(String nombUs) {
        NombUs = nombUs;
    }

    public String getNombUs() {
        return NombUs;
    }

    public double getBalance() {
        return balance;
    }

    public double getPrestamo() {
        return prestamo;
    }

    public double getTb() {
        return tb;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }

    public void setTb(double tb) {
        this.tb = tb;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
        this.balance = deposito + balance;
        this.prestamo = 48;
        this.tb = balance - prestamo;

    }
    public void actualizarBalance(double cambio) {
        if (balance + cambio >= 0) {
            balance += cambio;
        } else {
            double restante = cambio + balance;
            balance = 0;
            prestamo += restante;
        }
        this.tb = balance - prestamo;
    }
    public boolean puedeJugar(int costo) {
        return balance + prestamo >= costo;
    }
}