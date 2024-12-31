package controle.financeiro.com.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "CONTAS_BANCARIA")
//@Schema(description = "Modelo da Conta Bancária") <- do Swagger
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ContaBancaria {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CONTA_BANCARIA")
//    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Chave primária da tabela de Contas Bancarias")
    private Long id;

    @Column(name = "NOME_BANCO")
    //@Schema
    private String nomeBanco;

    @Column(name = "NUMERO_CONTA")
    //@Schema
    private Integer numeroConta;

    @Column(name = "AGENCIA")
    //@Schema
    private Integer agencia;

    @Column(name = "TIPO_CONTA")
    //@Schema
    private Integer tipo;

    @Column(name = "DATA_CRIACAO")
    //@Schema
    private LocalDateTime dataCriacao;

    @Column(name = "DATA_ATUALIZACAO")
    //@Schema
    private LocalDateTime dataAtualizacao;

    @OneToMany(mappedBy = "contaBancaria", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@Schema
    private List<TransacoesBancarias> transacoesBancarias;

    @OneToMany(mappedBy = "contaBancaria", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@Schema
    private List<SaldoBancario> saldosBancarios;

    @PrePersist
    protected void onCreate() {
        this.dataCriacao = LocalDateTime.now();
    }
}