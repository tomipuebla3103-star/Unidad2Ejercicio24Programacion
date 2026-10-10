public class ConexionMySQL {
    boolean conectada = false;

    public void conectar() {

        if (conectada) {
            System.out.println("MySQL: Ya está conectado.");
        } else {
            conectada = true;
            System.out.println("MySQL: Conexión establecida.");
        }
    }

    public void ejecutarConsulta(String sql) {

        if (conectada) {
            System.out.println("MySQL: Ejecutando consulta: " + sql);
        } else {
            System.out.println("MySQL: No hay una conexión activa.");
        }
    }

    public void desconectar() {

        if (conectada) {
            conectada = false;
            System.out.println("MySQL: Conexión cerrada.");
        } else {
            System.out.println("MySQL: Ya está desconectado.");
        }
    }
}




