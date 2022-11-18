package Repositories;

import java.util.List;
import javax.persistence.EmbeddedId;
import model.ChiTietPhieuMuon;
import model.chitietphieumuon_identity;

public class ChiTietPhieuMuonDAO {

    @EmbeddedId
    public chitietphieumuon_identity ctpm_id = new chitietphieumuon_identity();
    DAO dao;

    public ChiTietPhieuMuonDAO() {
        dao = new DAO();
    }

    public List<ChiTietPhieuMuon> getAllChiTietPhieuMuon() {
        dao.beginTransaction();
        List<ChiTietPhieuMuon> list_ChiTietPhieuMuon = dao.getAllObjects("ChiTietPhieuMuon");
        dao.commitTransaction();
        dao.closeAll();
        return list_ChiTietPhieuMuon;
    }

}
