package alura.foro.hub.domain.topico;

public record DatosRegistroTopico(
        String titulo,
        String mensaje,
        Integer status,
        String autor,
        Curso curso
) {
}
