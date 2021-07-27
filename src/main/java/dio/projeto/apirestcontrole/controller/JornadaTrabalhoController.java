package dio.projeto.apirestcontrole.controller;

import dio.projeto.apirestcontrole.models.JornadaTrabalho;
import dio.projeto.apirestcontrole.repository.JornadaRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Service
@RestController
@RequestMapping(value = "/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaRepository jornadaRepository;

    @PostMapping("/jornada")
    @ApiOperation(value = "Salva uma jornada")
    public JornadaTrabalho salvaJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de jornadas")
    public List<JornadaTrabalho> listaJornadaList(){
        return jornadaRepository.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna uma jornada única")
    public JornadaTrabalho  listaJornadaUnica(@PathVariable(value = "id") long id){
        return jornadaRepository.findById(id);
    }
    @PutMapping
    @ApiOperation(value = "Atualiza uma jornada")
    public JornadaTrabalho atualizaJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    @DeleteMapping("/jornada")
    @ApiOperation(value = "Deleta uma jornada")
    public void deletaJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        jornadaRepository.delete(jornadaTrabalho);
    }

}