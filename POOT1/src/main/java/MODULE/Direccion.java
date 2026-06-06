package MODULE;

public class Direccion {
    private String pais;
    private String ciudad;
    private String calle;
    private int numero;

    public Direccion(String pais, String ciudad, String calle, int numero){
        if(pais.isEmpty() || ciudad.isEmpty() || calle.isEmpty()){
            throw new IllegalArgumentException("Todos los campos de la dirección son obligatorios");
        }

        this.pais = pais;
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return '\n' +
                "Pais: " + pais + '\n' +
                "Ciudad: " + ciudad + '\n' +
                "Calle: " + calle + '\n' +
                "Numero: " + numero + '\n';
    }
}
