public class Personas {
    private String nombre;
    private String apelldio;

    public Personas(){}

    public Personas(String nombre, String apelldio) {
        this.nombre = nombre;
        this.apelldio = apelldio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldio() {
        return apelldio;
    }

    public void setApelldio(String apelldio) {
        this.apelldio = apelldio;
    }
}
