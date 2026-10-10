//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("=== 1. MYSQL ===");
    ConexionMySQL mysql = new ConexionMySQL();
    mysql.conectar();
    mysql.ejecutarConsulta("SELECT * FROM usuarios");
    mysql.desconectar();

    System.out.println("\n=== 2. POSTGRESQL ===");
    ConexionPostgreSQL postgres = new ConexionPostgreSQL();
    postgres.conectar();
    postgres.ejecutarConsulta("SELECT * FROM productos");
    postgres.desconectar();

    System.out.println("\n=== 3. MONGODB ===");
    ConexionMongoDB mongo = new ConexionMongoDB();
    mongo.conectar();
    mongo.ejecutarConsulta("db.clientes.find()");
    mongo.desconectar();
}

