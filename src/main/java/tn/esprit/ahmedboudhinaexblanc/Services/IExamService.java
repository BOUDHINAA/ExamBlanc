package tn.esprit.ahmedboudhinaexblanc.Services;

import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.ClassPlace;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Reservation;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Vol;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Voyageur;

import java.util.List;

public interface IExamService {
    String ajouterVolEtAeroport(Vol vol);
    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);
    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);
   // Reservation confirmerReservation(String ResId);
}
