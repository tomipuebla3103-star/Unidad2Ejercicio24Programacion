public class ConexionMongoDB {
    boolean conectada = false;

    public void conectar() {

        if (conectada) {
            System.out.println("MongoDB: Ya está conectado.");
        } else {
            conectada = true;
            System.out.println("MongoDB: Conexión establecida.");
        }
    }

    public void ejecutarConsulta(String sql) {

        if (conectada) {
            System.out.println("MongoDB: Ejecutando operación: " + sql);
        } else {
            System.out.println("MongoDB: No hay una conexión activa.");
        }
    }

    public void desconectar() {

        if (conectada) {
            conectada = false;
            System.out.println("MongoDB: Conexión cerrada.");
        } else {
            System.out.println("MongoDB: Ya está desconectado.");
        }
    }
}
