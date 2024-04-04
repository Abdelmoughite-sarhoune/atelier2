package pres;

import Metier.Metierimpl;
import dao.DaoImpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args ){
        DaoImpl2 dao=new DaoImpl2();
        Metierimpl metier =new Metierimpl();
        metier.setDao(dao);
        System.out.println("resultat"+metier.calcul());
    }
}
