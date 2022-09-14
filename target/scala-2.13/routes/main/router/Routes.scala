// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:12
  BookController_1: controllers.BookController,
  // @LINE:21
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:12
    BookController_1: controllers.BookController,
    // @LINE:21
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, BookController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, BookController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome/""" + "$" + """name<[^/]+>/""" + "$" + """lastName<[^/]+>""", """controllers.HomeController.welcome(name:String, lastName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BookController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BookController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BookController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit/""" + "$" + """id<[^/]+>""", """controllers.BookController.edit(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit""", """controllers.BookController.update()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BookController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/delete/""" + "$" + """id<[^/]+>""", """controllers.BookController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_0.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_tutorial2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial2_invoker = createInvoker(
    HomeController_0.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_about3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about3_invoker = createInvoker(
    HomeController_0.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_welcome4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("lastName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_welcome4_invoker = createInvoker(
    HomeController_0.welcome(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "welcome",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """welcome/""" + "$" + """name<[^/]+>/""" + "$" + """lastName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BookController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BookController_index5_invoker = createInvoker(
    BookController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "index",
      Nil,
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BookController_create6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BookController_create6_invoker = createInvoker(
    BookController_1.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "create",
      Nil,
      "GET",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BookController_show7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_show7_invoker = createInvoker(
    BookController_1.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BookController_edit8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_edit8_invoker = createInvoker(
    BookController_1.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_BookController_update9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit")))
  )
  private[this] lazy val controllers_BookController_update9_invoker = createInvoker(
    BookController_1.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "update",
      Nil,
      "GET",
      this.prefix + """books/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_BookController_save10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BookController_save10_invoker = createInvoker(
    BookController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "save",
      Nil,
      "GET",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_BookController_destroy11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_destroy11_invoker = createInvoker(
    BookController_1.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_0.explore)
      }
  
    // @LINE:8
    case controllers_HomeController_tutorial2_route(params@_) =>
      call { 
        controllers_HomeController_tutorial2_invoker.call(HomeController_0.tutorial)
      }
  
    // @LINE:9
    case controllers_HomeController_about3_route(params@_) =>
      call { 
        controllers_HomeController_about3_invoker.call(HomeController_0.about)
      }
  
    // @LINE:10
    case controllers_HomeController_welcome4_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromPath[String]("lastName", None)) { (name, lastName) =>
        controllers_HomeController_welcome4_invoker.call(HomeController_0.welcome(name, lastName))
      }
  
    // @LINE:12
    case controllers_BookController_index5_route(params@_) =>
      call { 
        controllers_BookController_index5_invoker.call(BookController_1.index())
      }
  
    // @LINE:13
    case controllers_BookController_create6_route(params@_) =>
      call { 
        controllers_BookController_create6_invoker.call(BookController_1.create())
      }
  
    // @LINE:14
    case controllers_BookController_show7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BookController_show7_invoker.call(BookController_1.show(id))
      }
  
    // @LINE:15
    case controllers_BookController_edit8_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BookController_edit8_invoker.call(BookController_1.edit(id))
      }
  
    // @LINE:16
    case controllers_BookController_update9_route(params@_) =>
      call { 
        controllers_BookController_update9_invoker.call(BookController_1.update())
      }
  
    // @LINE:17
    case controllers_BookController_save10_route(params@_) =>
      call { 
        controllers_BookController_save10_invoker.call(BookController_1.save())
      }
  
    // @LINE:18
    case controllers_BookController_destroy11_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BookController_destroy11_invoker.call(BookController_1.destroy(id))
      }
  
    // @LINE:21
    case controllers_Assets_versioned12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
