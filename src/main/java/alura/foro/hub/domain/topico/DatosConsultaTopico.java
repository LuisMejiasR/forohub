package alura.foro.hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosConsultaTopico(
        String titulo,
        String mensaje,
        Integer status,
        String autor
) {
        public DatosConsultaTopico(Topico topico) {
                this(topico.getTitulo(), topico.getMensaje(), topico.getStatus(), topico.getAutor());
        }
}
