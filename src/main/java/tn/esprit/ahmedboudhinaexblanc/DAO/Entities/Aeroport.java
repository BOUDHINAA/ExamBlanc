package tn.esprit.ahmedboudhinaexblanc.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAeroport;
    @Column(name = "nom", nullable = false )
    String nom;
    @Column(name = "code",length = 3)
    String codeAITA;
    @Column(name = "telephone")
    long telephone;
    @OneToMany(mappedBy= "aeroportDepart")
    @JsonIgnore
    List<Vol> departs;
    @OneToMany(mappedBy= "aeroportArrive")
    @JsonIgnore
    List<Vol> arrives;


}
