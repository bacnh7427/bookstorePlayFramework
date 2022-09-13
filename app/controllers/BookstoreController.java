package controllers;

import app.models.Bookstore;
import play.mvc.*;

public class BookstoreController extends Controller {

    // for all books
    public Result index(){
        return  ok(views.html.about.render());
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

    public  Result list(){
        List<Bookstore> bookstores = Bookstore.findAll();
        return ok(play.libs.Json.toJson(bookstores));
    }

}
