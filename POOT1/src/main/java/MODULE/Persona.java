package MODULE;

import Util.Excepciones;

public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private Direccion direccion;
    private Trabajador trabajador;

    public Persona(){
    }

    public Persona(String rut, String nombre, String apellido, int edad, String email, Trabajador trabajador) throws Excepciones {

        if(!rut.matches("[0-9]+-[0-9kK]")){
            throw new Excepciones("Formato de rut invalido");
        }
        if(rut.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || email.isEmpty()){ //solo se validan los datos del cliente, ya que el resto de ingresa manual
            throw new Excepciones("Faltan datos del cliente  ");
        }
        if(!email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{}|~^.-]+@[a-zA-Z0-9.-]+$")){
            throw new Excepciones("Inserte un email valido");
        }
        if(edad<0){
            throw new Excepciones("La edad debe ser mayor a 0");
        }

        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.direccion = new Direccion("Chile", "Santiago", "Tucapel", 567);
        this.trabajador = trabajador;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
        return  "Cliente:" + '\n' +
                "Rut: " + rut + '\n' +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Edad: " + edad + '\n' +
                "Email: " + email + '\n' +
                ":::::::::::::::::::::::::::::::" + '\n'+
                "Dirección: " + '\n' + direccion + '\n' +
                ":::::::::::::::::::::::::::::::"+ '\n' +
                "Trabajador: " +'\n'+ trabajador + '\n' +
                "......::::::Información de clientes::::::.....";

    }
}
