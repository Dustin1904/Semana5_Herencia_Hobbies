public class genero_anime extends VerAnime{
    public genero_anime() {

    }
    String genero_anime;

    public genero_anime(String genero_anime) {
        this.genero_anime = genero_anime;
    }

    public String getGenero_anime() {
        return genero_anime;
    }

    public void setGenero_anime(String genero_anime) {
        this.genero_anime = genero_anime;
    }
    public void imprimirGeneroAnime(){
        System.out.println("Mi genero de animes es: "+this.getGenero_anime());
    }
}
