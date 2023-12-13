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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idVeiculo;
    private String placa;
    private String modelo;
    private String cor;
    
    @ManyToOne
    @JoinColumn(name = "idMorador")
    private Morador morador;
}
