package alura.foro.hub.domain.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosAutenticacionUsuario(
        @NotBlank
        String login,
        @NotBlank
        String clave
) {
}
