
package Principal;
import Modelo.Conexion;
import Vistas.*;
public class Main {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.getConnection();
        // Creamos una instancia de la vista login
        Login login = new Login();
        login.setVisible(true); //Se llama al metodo que la hace visible
    }
    
}
