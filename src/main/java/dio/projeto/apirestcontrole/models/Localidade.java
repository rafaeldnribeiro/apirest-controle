package dio.projeto.apirestcontrole.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso; //Relacionamento N -> 1 (Muitas localidades para um nivel de acesso)
    private String descricao;
}
