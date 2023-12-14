package br.ufsm.csi.ParkHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pagamento")
public class Pagamento {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idPagamento; 
private Morador morador;
private Date dataVencimento;
private StatusPagamento statusPagamento;
private BigDecimal valor;   

public enum StatusPagamento {
    PENDENTE,
    PAGO,
    ATRASADO
}

}
