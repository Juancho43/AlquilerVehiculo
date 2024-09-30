package Model;
public class Reserva {
    private Usuario usuario;
    private int vehiculo;
    private int diasReservados;

    public Reserva(Usuario usuario, int vehiculo, int diasReservados) {
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

    public int getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(int vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public void setDiasReservados(int diasReservados) {
        this.diasReservados = diasReservados;
    }
}
