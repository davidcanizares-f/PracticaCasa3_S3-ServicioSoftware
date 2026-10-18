package negocio;

public class MainServicio {
    public static void main() {
        Servicio s = new Servicio();

        s.setNombre("API de Pagos");
        s.setPuerto(8080);

        System.out.println("Servicio: " + s.getNombre());
        System.out.println("Puerto: " + s.getPuerto());
        System.out.println(s.isActivo() ? "Estado: Activo" : "Estado: No activo");

        // Valores inválidos
        System.out.println("\n=== Valores inválidos === ");
        s.setNombre("");
        s.setPuerto(0);
        s.setCantidadPeticiones(-5);
        System.out.println("Nombre: " + s.getNombre());
        System.out.println("Puerto: " + s.getPuerto());
        System.out.println("Peticiones: " + s.getCantidadPeticiones());

        // Petición con el servicio detenido
        System.out.println("\n===  Servicio detenido === ");
        s.registrarPeticion();

        // Iniciar y registrar peticiones
        System.out.println("\n===  Servicio iniciado === ");
        s.iniciar();
        s.registrarPeticion();
        s.registrarPeticion();
        s.registrarPeticion();
        System.out.println("Activo: " + s.isActivo());
        System.out.println("Peticiones: " + s.getCantidadPeticiones());

        s.detener();
    }
}