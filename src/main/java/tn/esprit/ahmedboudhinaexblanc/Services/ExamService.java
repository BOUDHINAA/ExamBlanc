package tn.esprit.ahmedboudhinaexblanc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.ClassPlace;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Reservation;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Vol;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Voyageur;
import tn.esprit.ahmedboudhinaexblanc.DAO.Repositories.AeroportRepo;
import tn.esprit.ahmedboudhinaexblanc.DAO.Repositories.ReservationRepo;
import tn.esprit.ahmedboudhinaexblanc.DAO.Repositories.VolRepo;
import tn.esprit.ahmedboudhinaexblanc.DAO.Repositories.VoyageurRepo;

import java.util.List;

@Service
@AllArgsConstructor

public class ExamService implements IExamService{
    VolRepo volRepo;
    ReservationRepo reservationRepo;
    AeroportRepo aeroportrepo;
    VoyageurRepo voyageurRepo;

    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        Vol vol1=volRepo.findById(vol.getIdVol()).get();
        if(vol1!=null){
            return "Vol existe déja";
        }

        if(vol1.getAeroportDepart().getCodeAITA().equals(vol1.getAeroportArrive().getCodeAITA())){
            return "Aeroport de départ et d'arrivée doivent être différents";
        }
        aeroportrepo.save(vol1.getAeroportDepart());
        aeroportrepo.save(vol1.getAeroportArrive());
        
        volRepo.save(vol);
        return "Vol  ajouté avec succés";
        
}

    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        for(Voyageur V:voyageurs){
            voyageurRepo.save(V);
        }
        return(voyageurs);
    }

    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
        Voyageur voyageur =voyageurRepo.findById(voyageurId).get();
        Vol vol=volRepo.findById(volId).get();
        if(voyageur!=null){
            if(vol!=null){
                    Reservation reservation= new Reservation();
                    reservation.setVoyageur(voyageur);
                    reservation.setVol(vol);
                    reservation.setClassPlace(classPlace);
                    reservationRepo.save(reservation);
                    return "Reservation effectuée avec succés";
                }
            return "Vol n'existe pas";
            }
            return "voyageur n'existe pas ";
        }
/*
    @Override
    public Reservation confirmerReservation(String ResId) {
       // Reservation reservation= reservationRepo.findByIdResId);

        return ;
    }
*/

}



