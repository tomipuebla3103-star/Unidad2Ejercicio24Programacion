<img width="501" height="359" alt="image" src="https://github.com/user-attachments/assets/665780ad-419e-440c-8fc2-09ab50a79ff5" />

Motores de Base de Datos Intercambiables

Descripción
Este proyecto consiste en un sistema en Java que simula la conexión y ejecución de consultas en diferentes motores de bases de datos, como MySQL, PostgreSQL y MongoDB. Todos utilizan una interfaz común, lo que permite cambiar de motor sin modificar la lógica principal del programa.

Clases
- **ConexionBD:** interfaz que define los métodos `conectar()`, `ejecutarConsulta(String sql)` y `desconectar()`.
- **ConexionMySQL:** simula la conexión y ejecución de consultas en una base de datos MySQL.
- **ConexionPostgreSQL:** simula la conexión y ejecución de consultas en una base de datos PostgreSQL.
- **ConexionMongoDB:** simula la conexión y las operaciones de consulta en MongoDB.
- **Main:** crea las conexiones y prueba el funcionamiento de los distintos motores.

Funcionamiento
En el `main` se utilizan diferentes conexiones para simular el acceso a distintas bases de datos. Cada motor se maneja mediante una variable del tipo `ConexionBD`, permitiendo conectarse, ejecutar una consulta y desconectarse sin depender directamente de una clase concreta.

Recorrido del mensaje
1. El programa crea una conexión para el motor de base de datos elegido.
2. Se utiliza una variable de tipo `ConexionBD` para trabajar con la conexión.
3. Se invoca el método `conectar()` para iniciar la conexión.
4. Se llama a `ejecutarConsulta()` para simular una consulta.
5. La conexión verifica que esté activa antes de ejecutar la operación.
6. Se invoca `desconectar()` para finalizar la conexión.
7. Finalmente, se muestran por consola los mensajes correspondientes a cada operación.

Validaciones
El sistema debe comprobar que la conexión esté activa antes de ejecutar consultas y evitar desconectar una conexión que no se encuentra abierta. Si una operación no cumple las condiciones, debe informar el problema.

Objetivo
Practicar el uso de interfaces, la abstracción, el polimorfismo y el desacoplamiento entre la lógica del programa y los motores de bases de datos.
