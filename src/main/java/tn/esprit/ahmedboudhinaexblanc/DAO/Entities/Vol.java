package tn.esprit.ahmedboudhinaexblanc.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVol;
    @Column(name="datedepart")
    LocalDate dateDepart;
    @Column(name="datearrive")
    LocalDate dateArrive;

    @OneToMany(mappedBy= "vol")
    @JsonIgnore
    List<Reservation> reservations;
    @ManyToOne
    Aeroport aeroportArrive;
    @ManyToOne
    Aeroport aeroportDepart;
}
