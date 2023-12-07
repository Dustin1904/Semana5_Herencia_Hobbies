public class Main {
    public static void main(String[] args) {
        Hobbies hobbie1=new Hobbies();
        VerAnime anime=new VerAnime("Chuunibyou");
        JugarViedeojuegos juego=new JugarViedeojuegos("Mis Hobbies","Genshin Impact");
        JugarVolley volley=new JugarVolley("Mis Hobbies","Medianamente bueno");
        genero_anime generoAnime=new genero_anime("De todo un poco");
        genero_videojuego generoVideojuego=new genero_videojuego("De todo un poco igual xd");
        generoAnime.imprimirGeneroAnime();
        anime.imprimir();
        System.out.println("-----------------------");
        generoVideojuego.imprimirGeneroVideojuego();
        juego.imprimirVideojuego();
        System.out.println("-----------------------");
        volley.imprimirHabilidad();



    }
}