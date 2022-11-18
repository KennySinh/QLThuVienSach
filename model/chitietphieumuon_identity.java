package model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class chitietphieumuon_identity implements Serializable {

    @ManyToOne
    public Sach sach;
    @ManyToOne
    public PhieuMuon phieumuon;

    public chitietphieumuon_identity() {
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public PhieuMuon getPhieumuon() {
        return phieumuon;
    }

    public void setPhieumuon(PhieuMuon phieumuon) {
        this.phieumuon = phieumuon;
    }

}
