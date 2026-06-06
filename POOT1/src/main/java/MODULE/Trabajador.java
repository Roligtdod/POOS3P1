package MODULE;

import Util.Excepciones;

public class Trabajador {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private String cargo;

    public Trabajador(int id, String nombre, String apellido, String email, int telefono, String cargo){
        if(nombre.isEmpty() || apellido.isEmpty() || email.isEmpty() || cargo.isEmpty()){
            throw new IllegalArgumentException("Llene todos los datos del nuevo trabajador ");
        }
        if(id<0){
            throw new IllegalArgumentException("El ID del trabajador debe ser mayor a 0");
        }
        if(telefono<0){
            throw new IllegalArgumentException("Ingrese un numero de telefono valido");
        }
        if(!email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{}|~^.-]+@[a-zA-Z0-9.-]+$")){
            throw new IllegalArgumentException("Inserte un email valido para el trabajador");
        }

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  '\n' +
                "ID: " + id + '\n' +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Email: " + email + '\n' +
                "Telefono: " + telefono + '\n' +
                "Cargo:" + cargo + '\n';
    }
}
