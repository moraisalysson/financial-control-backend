package controle.financeiro.com.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Builder(toBuilder = true)
@Table(name = "SALDOS_BANCARIOS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SaldoBancario implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_SALDO_BANCARIO", unique = true, nullable = false, precision = 5)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_CONTA_BANCARIA")
    private ContaBancaria contaBancaria;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "DATA_CRIACAO")
    private LocalDateTime dataCriacao;

    @Column(name = "DATA_ATUALIZACAO")
    //@Schema
    private LocalDateTime dataAtualizacao;

    @PrePersist
    protected void onCreate() {
        this.dataCriacao = LocalDateTime.now();
    }
}
