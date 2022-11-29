use EF_G6;
insert into DensidadPieza(densidadPieza) 
		values (10),
			(15),
            (20),
            (30),
            (50),
            (90);
insert into Grosor(grosor)
values ("fino"),
		("normal"),
        ("grueso");
insert into Altura(altura)
values (0.1),         
       (0.2),
       (0.3),
       (0.4);
insert into Material3D(material)
values ("abs"),
("pla"),
("flexible");

insert into GrosorLinea(grosorLinea)
values("fino"),
("grueso");

insert into ColorLinea(colorLinea)
values("rojo"),
("negro");

insert into Material(material)
values("acrilico"),
("mdf"),
("carton");

insert into Resolucion(resolucion)
values("alta"),
("media"),
("baja");

insert into TipoServicio(tipoServicio)
values("Impresion 3D"),
("Corte Laser"),
("Escaneo Digital 3D");

insert into TipoUsuario(tipoUsuario)
values("interno"),
("externo");
      
       
            