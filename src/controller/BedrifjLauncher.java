package controller;

import database.AfdelingDAO;
import database.DBaccess;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class BedrifjLauncher {

    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar.\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }

    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("Bedrijf", "userBedrijf", "userBedrijfPW");
        dBaccess.openConnection();

        AfdelingDAO afdelingDAO = new AfdelingDAO(dBaccess);

        afdelingDAO.slaAfdelingOp(new Afdeling("HR","Hilversum"));
        System.out.println(afdelingDAO.geefAfdelingen());


        afdelingDAO.geefAfdelingenMetPlaats("Hilversum");
        dBaccess.closeConnection();

    }
}
