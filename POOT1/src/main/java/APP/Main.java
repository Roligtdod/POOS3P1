package APP;
import MODULE.Direccion;
import MODULE.Persona;
import MODULE.Trabajador;
import Util.Excepciones;


public class Main {
    public static void main(String[] args) {
        try {
            Trabajador t1 = new Trabajador(123, "Juan", "Tapia", "jtapia@lltour.cl", 1888888, "Practicante de turismo");
            Trabajador t2 = new Trabajador(124, "LOAO", "Perez", "lperez@lltour.cl", 123123123, "Guia turistico");
            Trabajador t3 = new Trabajador(125, "Jana", "Lopez", "jlopezz@lltour.cl", 98075312, "Guia turistico");

            Persona p1 = new Persona("1967525-2", "Max", "Pino", 34, "max@gmail.com", t1);

            Persona p2 = new Persona("1262222-0", "Maxsdfsaf", "Pinasdasdo", 20, "maasdasd@gmail.com", t2);
            p2.setDireccion(new Direccion("Peru", "Lima", "IDK", 123)); // Cambia la direccion para la persona 2
            p2.setNombre("Nico");
            p2.setApellido("Hormazabal");
            p2.setEmail("nnhormaza_{}@gmail.com"); //Modifica datos basicos con el setter correspondiente

            Persona p3 = new Persona("12699999-k", "Juan", "Perez", 28, "Jperere__@gmail.com", t1); // a cada persona se le asigna un  trabajador
            p3.setDireccion(new Direccion("Chile", "Valparaiso", "Mercado", 98));
            p3.setTrabajador(t3); //Modifica el trabajador a la persona 3


            System.out.println("la persona "+ p1.getNombre()+" "+p1.getApellido()+" Tiene asignado al trabajador ID: "+ p1.getTrabajador().getId() +" "
                                + "Nombre: "+p1.getTrabajador().getNombre() +" " + p1.getTrabajador().getApellido()); // imprime ID del trabajador asociado al cliente 1 (P1)
            System.out.println("la persona "+ p2.getNombre()+" "+p2.getApellido()+" Tiene asignado al trabajador ID: "+ p2.getTrabajador().getId() +" "
                                + "Nombre: "+p2.getTrabajador().getNombre() +" "+ p2.getTrabajador().getApellido());    // imprime ID del trabajador asociado al cliente 2 (P2)
            System.out.println("la persona "+ p3.getNombre()+" "+p3.getApellido()+" Tiene asignado al trabajador ID: "+ p3.getTrabajador().getId() +" "
                                + "Nombre: "+p3.getTrabajador().getNombre() +" "+ p3.getTrabajador().getApellido());    // imprime ID del trabajador asociado al cliente 3 (P3) con la modificacion realizada anmteriormente

            System.out.println("\n"+"......::::::Información de clientes::::::......");
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());

        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }

}
