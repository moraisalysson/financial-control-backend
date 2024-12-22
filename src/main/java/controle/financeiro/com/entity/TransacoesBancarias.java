package controle.financeiro.com.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Builder(toBuilder = true)
@Table(name = "TRANSACOES_BANCARIAS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TransacoesBancarias {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_TRANSACAO_BANCARIA", unique = true, nullable = false, precision = 5)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_CONTA_BANCARIA")
    private ContaBancaria contaBancaria;

    @Column(name = "TIPO")
    private Integer tipo;

    @Column(name = "CATEGORIA")
    private Integer categoria;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "A_CREDITO")
    private Integer aCredito;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "DATA_CRIACAO")
    private LocalDateTime dataCriacao;

    @Column(name = "DATA_ATUALIZACAO")
    //@Schema
    private LocalDateTime dataAtualizacao;
}
