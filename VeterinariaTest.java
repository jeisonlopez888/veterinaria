/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    public class Main {
        public static void main(String[] args) {
            // Crear algunas mascotas
            Mascota mascota1 = new Mascota(1, "Firulais", "Perro", "Labrador", 5, 'M', "Negro", 15.5);
            Mascota mascota2 = new Mascota(2, "Pelusa", "Gato", "Persa", 12, 'F', "Blanco", 6.2);
            Mascota mascota3 = new Mascota(3, "Rocky", "Perro", "Bulldog", 8, 'M', "Marrón", 20.3);
    
            // Almacenar las mascotas en una lista
            List<Mascota> listaMascotas = new ArrayList<>();
            listaMascotas.add(mascota1);
            listaMascotas.add(mascota2);
            listaMascotas.add(mascota3);
    
            // Obtener la lista de mascotas mayores a 10 años
            List<Mascota> mascotasMayores10 = new ArrayList<>();
            for (Mascota mascota : listaMascotas) {
                if (mascota.getEdad() > 10) {
                    mascotasMayores10.add(mascota);
                }
            }
    
            // Imprimir la lista de mascotas mayores a 10 años
            System.out.println("Mascotas mayores a 10 años:");
            for (Mascota mascota : mascotasMayores10) {
                System.out.println("Nombre: " + mascota.getNombre() + ", Edad: " + mascota.getEdad());
            }
        }
    }
    
    /**
     * Prueba para verificar que los datos de mascotas no estén nulos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio datosCompletos");
       Veterinaria veterinaria= new Veterinaria ("amigos peludos");
       assertEquals("amigos peludos", veterinaria.getNombre());
        LOG.info("Finalización datosCompletos");
    }

    /**
     * Prueba para agregar una mascota
     */
    @Test
    public void agragarMascota() {
        LOG.info("Inicio agregarMascota");
        Veterinaria veterinaria=new Veterinaria("amigos peludos");
        Mascota mascota= new Mascota(1, "Firulais", "Perro", "Labrador", 5, 'M', "Negro", 15.5);
        veterinaria.agregarMascota(mascota);
        assertTrue(veterinaria.getMascotas().contains(mascota));
        assertEquals(1, veterinaria.getMascotas().size());

        LOG.info("Finalización agregarMascota");
    }

   


}