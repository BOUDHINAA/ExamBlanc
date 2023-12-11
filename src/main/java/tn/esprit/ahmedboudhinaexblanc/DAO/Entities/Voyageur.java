package tn.esprit.ahmedboudhinaexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVoyageur;
    @Column(name = "nom")
    String nom;
    @Column(name = "prenom")
    String prenom;
    @Column(name = "dateNaissance")
    LocalDate dateNaissance;
    @OneToMany(mappedBy= "voyageur")
    List<Reservation> reservations;


}
