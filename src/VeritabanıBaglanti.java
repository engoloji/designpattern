import java.sql.*;
public class VeritabanıBaglanti {
    Connection con = DriverManager.getConnection("jdbc:dpattern://localhost:8658/xyz;user=engin;password=unlu;");

    public VeritabanıBaglanti() throws SQLException {
    }
}
//Projemizde bir veritabanı varmış varsayımı yaptık, bu baglantıyı tüm classlarda aynı sekilde kullanarak singletona uyduk.
