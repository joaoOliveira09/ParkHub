package br.ufsm.csi.ParkHub.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "morador")
public class Morador {
@Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Long idMorador;
 private String nome;
 private String cpf;
 private String telefone;
 private String email;
 private Date dataEntrada;

 @OneToMany(mappedBy = "morador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Veiculo> veiculos = new ArrayList<>();

 @ManyToOne
    @JoinColumn(name = "idUnidade")
    private UnidadeHabitacional unidadeHabitacional;

@ManyToMany(mappedBy = "moradores")
    private List<ReservaAreaComum> reservasAreaComum = new ArrayList<>();

@OneToMany(mappedBy = "morador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ocorrencia> ocorrencias = new ArrayList<>();

// Cada unidade habitacional tem vários moradores (relacionamento um para muitos).
// Cada morador pode ter vários veículos (relacionamento um para muitos).
// As áreas comuns podem ser reservadas por vários moradores e para várias finalidades (relacionamento muitos para muitos).
// Moradores podem registrar ocorrências (relacionamento um para muitos).

// Moradores realizam pagamentos (relacionamento um para muitos).
    
}
