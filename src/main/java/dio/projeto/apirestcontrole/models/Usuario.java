package dio.projeto.apirestcontrole.models;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario; //Relacionamento N -> 1(Muitos Usuarios para uma categoria)
    private String nome;
    @ManyToOne
    private Empresa empresa; //Relacionamento N -> 1(Muitos Usuarios para uma empresa)
    @ManyToOne
    private NivelAcesso nivelAcesso; //Relacionamento N -> 1(Muitos Usuarios para um nivel de acesso)
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho; //Relacionamento N -> 1(Muitos Usuarios para uma Jornada de trabalho)
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
