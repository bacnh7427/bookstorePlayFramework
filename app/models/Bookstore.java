package app.models;
import java.util.List;
import play.db.*;
//import play.db.Bookstore.DB;
//import com.example.*;
//import play.api.db.DB;
//import play.db.ebean.Model;

//import com.avaje.ebean.Ebean;
//import com.avaje.ebean.Query;

@Entity
public class Bookstore extends Model{
    public int id;
    public String name;
    public String description;

    public static Model.Finder<String, Bookstore> find = new Model.Finder<String, Bookstore>(String.class, Bookstore.class);

    public Bookstore(){

    }

    public Bookstore(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static  List<Bookstore> findAll(){
        return  Bookstore.find.orderBy("id").findList();
    }
}
