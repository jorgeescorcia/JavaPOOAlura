public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.duracionEnMinutos = 120;
        miPelicula.fechaLanzamiento = 20220302;
        miPelicula.incluidoEnElPlan = true;

        miPelicula.evalua(10);
        miPelicula.evalua(4.5);

        miPelicula.muestraFichaTecnica();

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());





    }
}
