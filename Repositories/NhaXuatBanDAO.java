package Repositories;

import java.util.List;
import model.NhaXuatBan;

public class NhaXuatBanDAO {

    DAO dao;

    public NhaXuatBanDAO() {
        dao = new DAO();
    }

    public List<NhaXuatBan> getAllNhaXuatBan() {
        dao.beginTransaction();
        List<NhaXuatBan> list_nxb = dao.getAllObjects("NhaXuatBan");
        dao.commitTransaction();
        dao.closeAll();
        return list_nxb;
    }

    public void saveNhaXuatBan(NhaXuatBan nxb) {
        dao.beginTransaction();
        dao.saveObject(nxb);
        dao.commitTransaction();
        dao.closeAll();
    }

    public void updateNhaXuatBan(NhaXuatBan nxb) {
        dao.beginTransaction();
        dao.Update(nxb);
        dao.commitTransaction();
        dao.closeAll();
    }

    public void deleteNhaXuatBan(NhaXuatBan nxb) {

        dao.beginTransaction();
        dao.DeleteObject(nxb);
        dao.commitTransaction();
        dao.closeAll();
    }

    public List<String> getDistinctNhaXuatBan() {
        return dao.DistinctQuery(new NhaXuatBan(), "ten");
    }

    public List<NhaXuatBan> filterNhaXuatBan(String nxb) {
        return dao.getObjectsWithCriteria("NhaXuatBan", "e.ten like '%" + nxb + "%'");
    }
}
