public class Servicio {
    // Atributos privados
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    // Getters y Setters

    //NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    // PUERTO
    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("Error: El puerto debe ser mayor que 0.");
        }
    }

    // ACTIVO
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // CANT. PETICIONES
    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        } else {
            System.out.println("Error: La cantidad de peticiones no puede ser negativa.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre +
                "\nPuerto: " + puerto +
                "\nActivo: " + activo +
                "\nCantidad de peticiones: " + cantidadPeticiones);
    }

    public void iniciar() {
        this.activo = true;
        System.out.println("El servicio " + this.nombre + " ha iniciado.");
    }

    public void detener() {
        this.activo = false;
        System.out.println("El servicio " + this.nombre + " se ha detenido.");
    }

    public void registrarPeticion() {
        if (this.activo) {
            this.cantidadPeticiones++;
            System.out.println("Petición registrada correctamente.");
        } else {
            System.out.println("No se puede registrar la petición, el servicio está detenido.");
        }
    }
}