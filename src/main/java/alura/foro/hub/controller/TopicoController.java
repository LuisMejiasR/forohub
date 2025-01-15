package alura.foro.hub.controller;

import alura.foro.hub.domain.topico.DatosRegistroTopico;
import alura.foro.hub.domain.topico.Topico;
import alura.foro.hub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody DatosRegistroTopico datosRegistroTopico) {
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

}
