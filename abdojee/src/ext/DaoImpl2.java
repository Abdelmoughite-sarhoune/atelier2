package ext;
import dao.iDao;
public class DaoImpl2 implements iDao{
    @Override
    public double getData() {
        System.out.println("version capteurs");
        double temp=1000;
        return temp;
    }
}
