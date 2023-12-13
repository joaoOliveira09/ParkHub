package br.ufsm.csi.ParkHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reservaAreaComum")
public class ReservaAreaComum {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idReservaAreaComum; 
private AreaComum areaComum;
private Morador morador;
private Date dataReserva;
private String finalidade;

@ManyToMany
    @JoinTable(
      name = "reserva_area_comum_moradores", 
      joinColumns = @JoinColumn(name = "idReservaAreaComum"), 
      inverseJoinColumns = @JoinColumn(name = "idMorador"))
    private List<Morador> moradores = new ArrayList<>();

}
