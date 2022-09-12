package app.controllers;
import play.mvc.*;

public class BookStoreController extends Controller{
//    public Result index() {
//        return ok(views.html.index.render());
//    }

    // for all books
    public Result index(){
        return TODO;
    }

    // to create book
    public Result create(){
        return Todo;

    }

    public Result save(){
        return Todo;
    }

    public Result edit(Integer id){
        return todo;
    }

    public Result update(){
        return Todo;
    }

    public Result destroy(Integer id){
        return id;
    }

    // for book details
    public Result show(Integer id){
        return id;
    }
}
