package controle.financeiro.com.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Builder(toBuilder = true)
@Table(name = "CATEGORIAS_TRANSACAO")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaTransacao implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CATEGORIA_TRANSACAO", unique = true, nullable = false, precision = 5)
    private Long id;

    @Column(name = "TIPO_TRANSACAO")
    private Integer tipoTransacao;

    @Column(name = "DESCRICAO")
    private String descricao;

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
