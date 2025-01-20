package alura.foro.hub.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DatosAutenticacionUsuario(
        @NotNull
        String login,
        @NotNull
        String clave
) {
}
