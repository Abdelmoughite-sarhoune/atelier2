package pres;

import Metier.Imetier;
import dao.iDao;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation2 {
    public static void main(String[] args) throws Exception{


            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName=scanner.nextLine();
            Class cDao=Class.forName(daoClassName);
           iDao dao=(iDao) cDao.newInstance();

           String metierClassName=scanner.nextLine();
           Class cMetier= Class.forName(metierClassName);
        Imetier Metier=(Imetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",iDao.class);
        method.invoke(Metier,dao );
        System.out.println("Resultat"+Metier.calcul());


        }
    }

