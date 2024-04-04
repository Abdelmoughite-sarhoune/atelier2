package Metier;
import dao.iDao;
public class Metierimpl implements Imetier{
    private iDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res = tmp * 540 / Math.cos(tmp * Math.PI);
        return res;
    }

    public void setDao(iDao dao) {
        this.dao = dao;
    }
}
