
import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setDuracionEnMinutos(1200);
        miPelicula.setFechaLanzamiento(2023);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evalua(10);
        miPelicula.evalua(4.5);

        miPelicula.muestraFichaTecnica();

        System.out.println(miPelicula.getSumaDeLasEvaluaciones());
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());





    }
}
