public class Libro {

    // Atributos privados (3), no se tocan desde afuera

    private String titulo;
    private String autor;
    private boolean disponible;

    //Constructores (3), se identifican porque se llaman igual que la clase
    //Los diferencia la cantidad y tipo de parámetros que reciben
    //Son de tipo (polimorfismo estático, sobrecarga de métodos)
    // Constructor vacio: por defecto, un libro es disponible

    public Libro() {
        disponible = true;
    }

    // Constructor con parametros: por defecto, un libro es disponible    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    
    // Constructor completo: recibe todos los datos
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    // Getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters

    public void setTitulo(String titulo) {
        //No acepta títulos vacíos
        if (titulo != null && !titulo.isEmpty()) { //null (no existe) o isEmpty (existe pero está vacío) != Diferente de, ! (Negación, no es)
            this.titulo = titulo;
        } else {
            System.out.println("Error: El título no puede estar vacío.");
        }
    }

    public void setAutor(String autor) {
      this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //Métodos
    //Imprime los datos del libro en la consola
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No")); //(Operador ternario)
    }
    //Marca el libro como prestado si está disponible, o muestra un mensaje de error si no lo está
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado."); //Cuando se presto
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible para préstamo."); //Cuando no se presto
            return false;
        }
    }
    //Marca el libro como devuelto
    public void devolver() {
            disponible = true;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
      
        }
}


