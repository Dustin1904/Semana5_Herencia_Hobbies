public class genero_videojuego extends JugarViedeojuegos{
    public genero_videojuego() {

    }
    String genero_videojuego;

    public genero_videojuego(String genero_videojuego) {
        this.genero_videojuego = genero_videojuego;
    }

    public String getGenero() {
        return genero_videojuego;
    }

    public void setGenero(String genero) {
        this.genero_videojuego = genero;
    }
    public void imprimirGeneroVideojuego(){
        System.out.println("Mi genero de videojuegos es: "+this.getGenero());
    }
}
