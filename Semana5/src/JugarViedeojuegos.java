public class JugarViedeojuegos extends Hobbies{
    public JugarViedeojuegos(){

    }
    String videojuego_favorito;

    public JugarViedeojuegos(String nombre, String videojuego_favorito) {
        this.videojuego_favorito = videojuego_favorito;
    }

    public String getVideojuego_favorito() {
        return videojuego_favorito;
    }

    public void setVideojuego_favorito(String videojuego_favorito) {
        this.videojuego_favorito = videojuego_favorito;
    }
    public void imprimirVideojuego(){
        System.out.println("Mi videojuego favorito es: "+this.getVideojuego_favorito());
    }
}
