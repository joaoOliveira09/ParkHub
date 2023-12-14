package br.ufsm.csi.ParkHub.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "areaComum")
public class AreaComum {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idAreaComum;
    private Tipo nome;
    private String descricao;
    private Long capacidadeMaxima;

    public enum Tipo {
    PISCINA,
    CHURRASQUEIRA,
    JARDIM,
    LAVANDERIA,
    SALAO
}
}
