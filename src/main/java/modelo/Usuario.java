package modelo;

public class Usuario {

    private String nombre;
    private String apellido;
    private String nick;
    private String edad;
    private String claveAcceso;
    private String correo;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nick, String edad, String claveAcceso, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.edad = edad;
        this.claveAcceso = claveAcceso;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", nick=" + nick + ", edad=" + edad + ", claveAcceso=" + claveAcceso + ", correo=" + correo + '}';
    }
    
    

}
