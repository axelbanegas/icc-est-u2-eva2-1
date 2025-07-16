package controllers;

import java.util.List;
import models.Book;
import java.util.Set;
import java.util.TreeSet;

public class LibroController {
    
   public Set<Book> procesarLibros(List<Book> libros) {
    return new TreeSet<>(libros);
}
}
