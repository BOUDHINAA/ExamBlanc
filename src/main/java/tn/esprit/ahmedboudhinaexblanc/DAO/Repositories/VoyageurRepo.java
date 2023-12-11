package tn.esprit.ahmedboudhinaexblanc.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Voyageur;

public interface VoyageurRepo extends JpaRepository<Voyageur, Integer> {
}
