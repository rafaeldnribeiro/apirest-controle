package dio.projeto.apirestcontrole.repository;

import dio.projeto.apirestcontrole.models.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
    JornadaTrabalho findById(long idJornada);
}
