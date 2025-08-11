package challenge.api.challenge.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotNull
        Long usuarioId,

        @NotBlank
        String mensaje,

        @NotBlank
        String nombreDelCurso,

        @NotBlank
        String titulo
) {
}
