package database;

import model.Afdeling;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class AfdelingDAO extends AbstractDAO{
    public AfdelingDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaAfdelingOp(Afdeling afdeling) {
        String sql = "INSERT INTO `afdeling` (afdelingsnaam, afdelingsplaats) VALUES (?, ?);";
        try {
            setupPreparedStatement(sql);
            getPreparedStatement().setString(1, afdeling.getAfdelingNaam());
            getPreparedStatement().setString(2, afdeling.getAfdelingPlaats());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }
    }

    public ArrayList<Afdeling> geefAfdelingen() {
        ArrayList<Afdeling> afdelings = new ArrayList<>();
        String sql =    "SELECT afdelingsnaam, afdelingsplaats " +
                "FROM `afdeling`;";

        try {
            setupPreparedStatement(sql);
            ResultSet resultSet = executeSelectStatement();

            while (resultSet.next()) {
                String afdelingsnaam = resultSet.getString("afdelingsnaam");
                String afdelingsplaats = resultSet.getString("afdelingsplaats");

                afdelings.add(new Afdeling(afdelingsnaam, afdelingsplaats));

            }
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }
        return afdelings;
    }

    public void geefAfdelingenMetPlaats(String afdelingsPlaats) {
        ArrayList<Afdeling> afdelings = geefAfdelingen();
        for (Afdeling afdeling : afdelings) {
            if(afdeling.getAfdelingPlaats().equals(afdelingsPlaats )) {
                System.out.println(afdeling.toString());
            }

        }
    }
}

