package alura.foro.hub.controller;

import alura.foro.hub.domain.topico.DatosConsultaTopico;
import alura.foro.hub.domain.topico.DatosRegistroTopico;
import alura.foro.hub.domain.topico.Topico;
import alura.foro.hub.domain.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@Valid @RequestBody DatosRegistroTopico datosRegistroTopico) {
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosConsultaTopico> listadoTopicos(Pageable paginacion) {
        return topicoRepository.findAll(paginacion).map(DatosConsultaTopico::new);
    }

}
