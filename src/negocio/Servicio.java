package negocio;

public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        }

    }
    public String getNombre() {
        return nombre;
    }

    public void setPuerto(int puerto) {
        if(puerto > 0){
            this.puerto = puerto;
        }

    }
    public int getPuerto() {
        return puerto;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if(cantidadPeticiones >= 0){
            this.cantidadPeticiones = cantidadPeticiones;
        }

    }
    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public boolean isActivo() {
        return activo;
    }

    //metodos adicionales
    public void iniciar(){
        if(!activo){
            activo = true;
            System.out.println("Servicio '" + nombre + "' activado.");
        }else{
            System.out.println("El servicio: " + nombre + " ya había sido activado.");
        }
    }

    public void detener(){
        if(activo){
            activo = false;
            System.out.println("Servicio: " + nombre + " desactivado.");
        }else{
            System.out.println("El servicio '" + nombre + "' ya había sido desactivado.");
        }
    }
    public void registrarPeticion(){
        if (this.activo) {
            this.cantidadPeticiones++;
            System.out.println("> Peticion Registrada.");
        } else {
            System.out.println("El servicio está detenido: no se puede registrar la petición.");
        }
    }





}
