import java.sql.*;


public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
 
    public DBConnect() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicule_java", "root", "admin");
            st = con.createStatement();
            
        } catch(Exception ex) {
            System.out.println("Error: "+ex);
        } 
    }
    
    public void insertData(String marque, int dateAchat, double prixAchat, double prixCourant) {
        try {
            String query = "INSERT INTO vehicule(marque, anneeSortie, prixAchat) VALUES(marque, anneeSortie, prixAchat)";
            st.executeUpdate(query);
            System.out.println("Enregistré dans la base de données !");
        
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void getData() {
        try {
            String query = "SELECT * FROM vehicule";
            rs = st.executeQuery(query);
            while(rs.next()) {
                String marque = rs.getString("marque");
                int anneeSortie = rs.getInt("anneeSortie");
                double prixAchat = rs.getDouble("prixAchat");
                System.out.println("Marque: " +marque+ "\n" + "Date d'achat: " +anneeSortie+ "\n" + "Prix d'achat: " +prixAchat);
            }
        
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
    Connection ObtenirConnexion() {
        return con;
    }
    
}
