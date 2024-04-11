
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;

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


        Series casaDragon = new Series();
        casaDragon.setNombre("La casa del Dragón");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporada(3);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodios(45);

        casaDragon.muestraFichaTecnica();
        System.out.println("La cantidad de minutos de la peliculas es: "+casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(15);
        episodio.setNombre("La casa perdida");
        episodio.setTotalVisualizaciones(200);





    }
}
