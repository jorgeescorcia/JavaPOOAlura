public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;

    int totalDeLasEvaluaciones;



    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("La duracion es minutos es: "+ duracionEnMinutos);


    }

    void evalua(double nota){
        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalDeLasEvaluaciones++;

    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones /totalDeLasEvaluaciones;
    }

}
