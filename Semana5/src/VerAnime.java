public class VerAnime extends Hobbies {
    public VerAnime() {

    }

    String anime_favorito;

    public VerAnime(String anime_favorito) {

        this.anime_favorito = anime_favorito;
    }

    public String getAnime_favorito() {
        return anime_favorito;
    }

    public void setAnime_favorito(String anime_favorito) {
        this.anime_favorito = anime_favorito;
    }
    public void imprimir(){
        System.out.println("Mi anime favorito es: "+this.getAnime_favorito());
    }
}
