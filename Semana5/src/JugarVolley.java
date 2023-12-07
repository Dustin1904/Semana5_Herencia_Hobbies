public class JugarVolley extends Hobbies{
    public JugarVolley(){

    }
    String nivel_habilidad;

    public JugarVolley(String nombre, String nivel_habilidad) {
        this.nivel_habilidad = nivel_habilidad;
    }

    public String getNivel_habilidad() {
        return nivel_habilidad;
    }

    public void setNivel_habilidad(String nivel_habilidad) {
        this.nivel_habilidad = nivel_habilidad;
    }
    public void imprimirHabilidad(){
        System.out.println("Mi nivel de habilidad es: "+this.getNivel_habilidad());
    }
}
