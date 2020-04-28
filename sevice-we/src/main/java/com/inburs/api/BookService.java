package com.inbursa.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.xml.XMLName;

@Path("/book")
public class BookService {
	
	@GET
	@Path("/{titulo}/{nombre}")
	@Produces(MediaType.APPLICATION_JSON)	
	public Response leerLibro(@PathParam("titulo")String titulo, @PathParam("nombre")String nombre) {
		Book book = new Book();
		book.setAutor(nombre);
		book.setTitulo(titulo);
		return Response.ok(book).build();		
	}
}



class Book{
	
	private String titulo;
	private String autor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
