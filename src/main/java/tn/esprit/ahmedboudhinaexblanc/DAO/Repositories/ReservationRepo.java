package tn.esprit.ahmedboudhinaexblanc.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmedboudhinaexblanc.DAO.Entities.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, String> {
}
