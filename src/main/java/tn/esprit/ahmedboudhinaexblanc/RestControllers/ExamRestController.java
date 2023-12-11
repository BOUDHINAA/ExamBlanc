package tn.esprit.ahmedboudhinaexblanc.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.ClassPlace;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Vol;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Voyageur;
import tn.esprit.ahmedboudhinaexblanc.Services.IExamService;

import java.util.List;


@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class ExamRestController {


    IExamService iExamService;

    @PostMapping("ajouterVolEtAeroport")
    public String ajouterVolEtAeroport(@RequestBody Vol vol){
        return iExamService.ajouterVolEtAeroport(vol);
    }

    @PostMapping("ajouterVoyageurs")
    List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs){
        return iExamService.ajouterVoyageurs(voyageurs);
    }
    @PostMapping("reserverVol")
    String reserverVol(@RequestBody int voyageurId, @RequestBody int volId, @RequestBody ClassPlace classPlace){
        return iExamService.reserverVol(voyageurId, volId, classPlace);
    }

}