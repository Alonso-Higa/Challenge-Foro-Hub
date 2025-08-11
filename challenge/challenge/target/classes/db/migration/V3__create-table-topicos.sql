CREATE TABLE topicos (
                         id BIGINT NOT NULL AUTO_INCREMENT,
                         usuario_id BIGINT NOT NULL,
                         mensaje VARCHAR(1000) NOT NULL,
                         nombre_del_curso VARCHAR(255),
                         titulo VARCHAR(255),
                         activo BOOLEAN NOT NULL DEFAULT true,
                         PRIMARY KEY (id),
                         CONSTRAINT fk_topicos_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
