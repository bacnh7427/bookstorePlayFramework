
package views.html.Home

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name : String, lastName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>
  Welcome """),_display_(/*12.12*/name),format.raw/*12.16*/(""" """),_display_(/*12.18*/lastName),format.raw/*12.26*/(""" """),format.raw/*12.27*/("""to PlayFrameork
</h1>
</body>
</html>"""))
      }
    }
  }

  def render(name:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(name,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,lastName) => apply(name,lastName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Home/welcome.scala.html
                  HASH: 087b41e301dfbdff059af75d198d742df3fda180
                  MATRIX: 921->1|1049->34|1081->40|1239->171|1264->175|1293->177|1322->185|1351->186
                  LINES: 27->1|32->1|35->4|43->12|43->12|43->12|43->12|43->12
                  -- GENERATED --
              */
          