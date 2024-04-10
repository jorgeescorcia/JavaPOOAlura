public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.duracionEnMinutos = 120;
        miPelicula.fechaLanzamiento = 20220302;
        miPelicula.incluidoEnElPlan = true;

        System.out.println("Mi peliculas es: "+ miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: "+ miPelicula.fechaLanzamiento);


    }
}
