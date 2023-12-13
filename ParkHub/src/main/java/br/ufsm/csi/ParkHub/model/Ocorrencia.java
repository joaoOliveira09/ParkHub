package br.ufsm.csi.ParkHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ocorrencia")
public class Ocorrencia {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idOcorrencia; 
private String descricao;
private Date dataRegistro;

@ManyToOne
    @JoinColumn(name = "idMorador")
    private Morador morador;

    @ManyToOne
    @JoinColumn(name = "idUnidadeHabitacional")
    private UnidadeHabitacional unidadeHabitacional;


}
