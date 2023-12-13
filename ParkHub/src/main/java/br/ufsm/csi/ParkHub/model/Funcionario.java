package br.ufsm.csi.ParkHub.model;

import java.sql.Date;

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
@Table(name = "funcionario")
public class Funcionario {
@Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Long idFuncionario;
 private String nome;
 private String cpf;
 private String telefone;
 private String email;
// Enum com possiveis cargos
 private Cargo cargo;
 private Date dataContratacao;

 public enum Cargo {
    GERENTE,
    ESTAGIARIO
}
    
}
