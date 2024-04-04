package ext;
import dao.iDao;
public class DaoImplws implements iDao{
    @Override
    public double getData() {
        System.out.println("version web service");
        return 90;
    }
}
