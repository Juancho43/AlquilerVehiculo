package Model;
public class Reserva {
    private Usuario usuario;
    private Vehiculo vehiculo;
    private int diasReservados;

    public Reserva(Usuario usuario, Vehiculo vehiculo, int diasReservados) {
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.diasReservados = diasReservados;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public void setDiasReservados(int diasReservados) {
        this.diasReservados = diasReservados;
    }
}
