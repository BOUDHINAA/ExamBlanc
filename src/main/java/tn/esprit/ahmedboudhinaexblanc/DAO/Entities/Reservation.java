package tn.esprit.ahmedboudhinaexblanc.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id

    String idReservation;
    LocalDate dateReservation;
    @Enumerated(EnumType.STRING)
    ClassPlace classPlace;
    @Enumerated(EnumType.STRING)
    EtatReservation etatReservation;
    @ManyToOne(cascade = CascadeType.ALL)
    Voyageur voyageur;
    @ManyToOne
    @JsonIgnore
    Vol vol;
}
