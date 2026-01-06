-- database: ../database/EXOBOT.sqlite
/*
Autor: anthonnyalmeida
Fecha: 6.enero.2026
Script: Insertar Catalogos 
*/


INSERT INTO CatalogoTipo
( Nombre,          Descripcion) VALUES
( 'Tipo Persona',  'tipos sold, meca, ...'),
( 'Sexo',          'mas, feme,...'),
( 'EstadoCivil',   'sol, viu, cas,...'),
( 'Raza',          'Negro, blanco,...');

INSERT INTO Catalogo
 (IdCatalogoTipo, Nombre,        Descripcion) VALUES
 (1,             'Soldado',      'tipos de perso del ejercito'),
 (1,             'Mecanico',     'tipos de perso del ejercito'),
 (1,             'Experto Ing.', 'tipos de perso del ejercito'),
 (1,             'Experto Esp.', 'tipos de perso del ejercito'),

 (2,             'Masculino',     'tipos de sexualida'),
 (2,             'Femenino',      'tipos de sexualida'),
 (2,             'Hibrido',       'tipos de sexualida'),
 (2,             'Asexual',       'tipos de sexualida'),

 (3,             'Soltero',       'tipos de estado civil Ecu.'),
 (3,             'Casado',        'tipos de estado civil Ecu.'),
 (3,             'Divorsiado',    'tipos de estado civil Ecu.'),
 (3,             'Viudo',         'tipos de estado civil Ecu.'),

 (4,             'Negro',         'tipos de raza'),
 (4,             'Blaco',         'tipos de raza'),
 (4,             'Mestizo',       'tipos de raza'),
 (4,             'Indígena',      'tipos de raza');

insert INTO IABot (Nombre, Observacion)
            VALUES("IA-RUSO", "Inteligencia artificial");

INSERT INTO ExaBot
    (IdIABot,   Nombre,     Serie) VALUES
    (1,         "exabot1",  "Serie E1"),
    (1,         "exabot2",  "Serie E2");

INSERT INTO Persona
(   IdCatalogoTipoPersona, IdCatalogoSexo, IdCatalogoEstadoCivil, Cedula,  Nombre,  Apellido) VALUES
(   1,                      5,              9,                    "11111", "pepe",  "plata"),
(   2,                      5,              10,                   "22222", "juan",  "panchala"),
(   3,                      5,              11,                   "33333", "pedro", "putin"),
(   4,                      5,              12,                   "44444", "pablo", "aguilera"),
(   1,                      6,              9,                    "01010", "ana",   "alcantara"),
(   2,                      6,              10,                   "02020", "pepa",  "pig"),
(   3,                      6,              11,                   "03030", "Gelen", "Tarter"),
(   4,                      6,              12,                   "04040", "Cami",  "Garcia");


SELECT IdCatalogo
,IdCatalogoTipo
,Nombre
,Descripcion
,Estado
,FechaCreacion
,FechaModifica
FROM Catalogo
WHERE Estado = 'A'
AND IdCatalogoTipo = 2;