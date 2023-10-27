CREATE USER appdev WITH PASSWORD 'appdev20231';
CREATE DATABASE appdevcam OWNER appdev;
CREATE SEQUENCE SQ_BOOKS_ID START 100001;

CREATE TABLE books (
	bk_id numeric NOT NULL,
	bk_at_id numeric NOT NULL,
	bk_ct_id numeric NOT NULL,
	bk_name varchar NOT NULL,
	bk_price numeric NOT NULL,
	bk_status varchar NULL,
	CONSTRAINT books_pk PRIMARY KEY (bk_id),
	CONSTRAINT books_auth_fk FOREIGN KEY (bk_at_id) REFERENCES public.authors(at_id) ON DELETE RESTRICT ON UPDATE RESTRICT,
	CONSTRAINT books_cat_fk FOREIGN KEY (bk_ct_id) REFERENCES public.categories(ct_id) ON DELETE RESTRICT ON UPDATE RESTRICT
);


CREATE TABLE authors (
	at_id numeric NOT NULL,
	at_name varchar NOT NULL,
	at_birth_date date NULL,
	at_country varchar NULL,
	CONSTRAINT authors_pk PRIMARY KEY (at_id)
);

CREATE TABLE categories (
	ct_id numeric NOT NULL,
	ct_name varchar NOT NULL,
	ct_file varchar NOT NULL,
	CONSTRAINT categories_pk PRIMARY KEY (ct_id)
);


--- inserts

INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(1, 'NOVELA ADOLESCENTE', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(2, 'CUENTOS INFANTILES', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(3, 'CUENTOS DE TERROR', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(4, 'NOVELA JUVENIL', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(5, 'HISTORICO', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(6, 'NOVELA GENERO LIRICO', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(7, 'NOVELA GENERO EPICO', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(8, 'NOVELA GENERO DRAMATICO', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(9, 'AUTOAYUDA', 'ARCHIVO');
INSERT INTO public.categories
(ct_id, ct_name, ct_file)
VALUES(10, 'ECONOMIA', 'ARCHIVO');



INSERT INTO public.authors
(at_id, at_name, at_birth_date, at_country)
VALUES(1, 'EDGAR ALLAN POE', '1809-01-19', 'USA');
INSERT INTO public.authors
(at_id, at_name, at_birth_date, at_country)
VALUES(2, 'AGATHA CHRISTIE', '1890-09-15', 'ENGLAND');
INSERT INTO public.authors
(at_id, at_name, at_birth_date, at_country)
VALUES(3, 'DAN BROWN', '1960-06-22', 'USA');
INSERT INTO public.authors
(at_id, at_name, at_birth_date, at_country)
VALUES(4, 'STEPHEN KING', '1947-09-21', 'USA');
INSERT INTO public.authors
(at_id, at_name, at_birth_date, at_country)
VALUES(5, 'GABRIEL GARCIA MARQUEZ', '1927-03-06', 'COLOMBIA');


INSERT INTO public.books
(bk_id, bk_at_id, bk_ct_id, bk_name, bk_price, bk_status)
VALUES(100023, 4, 3, 'CEMENTARIO DE ANIMALES', 12.83, 'DISPONIBLE');
INSERT INTO public.books
(bk_id, bk_at_id, bk_ct_id, bk_name, bk_price, bk_status)
VALUES(100022, 3, 8, 'ANGELES Y DEMONIOS', 3.65, 'DISPONIBLE');
INSERT INTO public.books
(bk_id, bk_at_id, bk_ct_id, bk_name, bk_price, bk_status)
VALUES(100034, 4, 3, 'LA CÚPULA', 23.45, 'DISPONIBLE');
INSERT INTO public.books
(bk_id, bk_at_id, bk_ct_id, bk_name, bk_price, bk_status)
VALUES(100021, 2, 8, 'LA MUERTE VISITA AL DENTISTA', 23.65, 'DISPONIBLE');
INSERT INTO public.books
(bk_id, bk_at_id, bk_ct_id, bk_name, bk_price, bk_status)
VALUES(100024, 1, 4, 'LA CAIDA DE LA FAMILIA USHER', 8.32, 'DISPONIBLE');

