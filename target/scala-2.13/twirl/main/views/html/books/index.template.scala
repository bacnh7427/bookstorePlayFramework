
package views.html.books

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>All Book</h1>

"""),_display_(/*12.2*/for(book <- books) yield /*12.20*/{_display_(Seq[Any](format.raw/*12.21*/("""
    """),format.raw/*13.5*/("""<a href="#"> """),_display_(/*13.19*/book/*13.23*/.title),format.raw/*13.29*/("""</a>
    <p>Price: """),_display_(/*14.16*/book/*14.20*/.price),format.raw/*14.26*/("""</p>
    <p>Author : """),_display_(/*15.18*/book/*15.22*/.author),format.raw/*15.29*/("""</p>
""")))}),format.raw/*16.2*/("""

"""),format.raw/*18.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/index.scala.html
                  HASH: 943f0dc7769ae457df8442583e61583cc4c6c02a
                  MATRIX: 916->1|1030->20|1060->24|1222->160|1256->178|1295->179|1328->185|1369->199|1382->203|1409->209|1457->230|1470->234|1497->240|1547->263|1560->267|1588->274|1625->281|1656->285
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|49->18
                  -- GENERATED --
              */
          