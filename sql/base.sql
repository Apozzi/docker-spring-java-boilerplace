CREATE TABLE public."Person"
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    data_nasc date,
    naturalidade character varying COLLATE pg_catalog."default",
    nome character varying COLLATE pg_catalog."default",
    sexo character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    cpf character varying COLLATE pg_catalog."default"
)

TABLESPACE pg_default;