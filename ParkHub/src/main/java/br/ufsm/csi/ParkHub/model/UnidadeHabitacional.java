package br.ufsm.csi.ParkHub.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "unidadeHabitacional")
public class UnidadeHabitacional {
@Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Long idUnidade;
 private Long numeroUnidade;
 private Long numeroQuartos;
 private Long numeroBanheiros;
 private String area;
 private Tipo tipo;
 private String informacoesAdicionais;

 @OneToMany(mappedBy = "unidadeHabitacional", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Morador> moradores = new ArrayList<>();

 public enum Tipo {
    CASA,
    APARTAMENTO
}
}
