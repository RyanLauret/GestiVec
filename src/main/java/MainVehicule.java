import java.util.*;
import java.sql.*;

public class MainVehicule {
    
    public static void main(String[] args) {

        DBConnect connect = new DBConnect();

        connect.insertData("Nissan", 2019, 28000.0, 28000.0);

        /*int An = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Année actuelle: "+An);
        Vehicule V1;
        V1 = new Vehicule("Renault", 2019, 25000.0);
        V1.affiche();

        Voiture VO1;
        VO1 = new Voiture("Nissan", 1998, 70000.50, 2.5, 8, 350,127000.0);
        VO1.calculePrix(An);
        VO1.affiche();
        
        Avion A380;
        A380 = new Avion("Airbus", 2015, 1000000, "HELICE", 500);
        A380.calculePrix(An);
        A380.affiche();*/

        connect.getData();
    }
}
