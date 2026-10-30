public class Lector {
    
    private String nombre;
    private String cedula;
    private Libro libroActual; //Refencia a un objeto libro - puede ser null 
                               //Aquí se está dando la asociación 

    //Constructores

    public Lector() {
        //Constructor vacio
    }

    public Lector(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Libro getLibroActual() {
        return libroActual;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setLibroActual(Libro libroActual) {
        this.libroActual = libroActual;
    }

    //Métodos
    //Toma un libro prestado, llama al método prestar () del libro

    public void tomarPrestado(Libro libro) { //Se utiliza la asociación para acceder a los métodos del libro
        if (libroActual != null) {
            System.out.println(nombre + " ya tiene el libro \"" + libroActual.getTitulo() + "\". Debe devolverlo antes de tomar otro libro prestado.");
        } else {
          if (libro.prestar()) { //Se llama al método prestar() del libro
            libroActual = libro;
          }
        }
    }

    //Devuelve el libro actual, llama al método devolver() del libro
    public void regresarLibro() {
        if (libroActual == null) {
            System.out.println(nombre + " no tiene ningún libro.");
        } else {
            libroActual.devolver();
            libroActual = null;
        }
    }

    //Muestra el estado del lector
    public void mostrarEstado() {
        String estado = (libroActual != null) ? libroActual.getTitulo() : "Sin libro";
        System.out.println("Lector: " + nombre + "| Libro: "  + estado);
    }
}
