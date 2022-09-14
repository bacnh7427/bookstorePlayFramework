package controllers;

import models.Book;
import views.html.books.*;
import java.util.*;
import java.util.Set;


import play.mvc.*;
public class BookController extends Controller {

    // for all books
    public Result index(){
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
//        return  ok(views.html.about.render());
    }

    // to create book
    public Result create(){
        return  ok(views.html.about.render());

    }

    public Result save(){
        return  ok(views.html.about.render());
    }

    public Result edit(Integer id){
        return  ok(views.html.about.render());
    }

    public Result update(){
        return  ok(views.html.about.render());
    }

    public Result destroy(Integer id){
        return  ok(views.html.about.render());
    }

    // for book details
    public Result show(Integer id){
        return  ok(views.html.about.render());
    }

//    public  Result list(){
//        List<Book> bookstores = Book.findAll();
//        return ok(play.libs.Json.toJson(bookstores));
//    }

}
