public class ConexionPostgreSQL {
    boolean conectada = false;

    public void conectar() {

        if (conectada) {
            System.out.println("PostgreSQL: Ya está conectado.");
        } else {
            conectada = true;
            System.out.println("PostgreSQL: Conexión establecida.");
        }
    }

    public void ejecutarConsulta(String sql) {

        if (conectada) {
            System.out.println("PostgreSQL: Ejecutando consulta: " + sql);
        } else {
            System.out.println("PostgreSQL: No hay una conexión activa.");
        }
    }

    public void desconectar() {

        if (conectada) {
            conectada = false;
            System.out.println("PostgreSQL: Conexión cerrada.");
        } else {
            System.out.println("PostgreSQL: Ya está desconectado.");
        }
    }
}
