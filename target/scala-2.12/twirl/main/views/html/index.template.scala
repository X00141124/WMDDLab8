
package views.html

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
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main("Products Page")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
  
  """),format.raw/*4.3*/("""<p class="lead">Product Catalogue</p>


  """),_display_(/*7.4*/if(flash.containsKey("success"))/*7.36*/{_display_(Seq[Any](format.raw/*7.37*/("""
      """),format.raw/*8.7*/("""<div class="alert alert-success">
        """),_display_(/*9.10*/flash/*9.15*/.get("success")),format.raw/*9.30*/("""
      """),format.raw/*10.7*/("""</div>
  """)))}),format.raw/*11.4*/("""

  
  """),format.raw/*14.3*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*39.4*/for(p<-products) yield /*39.20*/ {_display_(Seq[Any](format.raw/*39.22*/("""
  """),format.raw/*40.3*/("""<tr>
  
  <td>"""),_display_(/*42.8*/p/*42.9*/.getId),format.raw/*42.15*/("""</td>
  
  <td>"""),_display_(/*44.8*/p/*44.9*/.getName),format.raw/*44.17*/("""</td>
  
  <td>"""),_display_(/*46.8*/p/*46.9*/.getDescription),format.raw/*46.24*/("""</td>
  
  <td>"""),_display_(/*48.8*/p/*48.9*/.getStock),format.raw/*48.18*/("""</td>

  <td class="numeric">&euro; """),_display_(/*50.31*/("%.2f".format(p.getPrice))),format.raw/*50.58*/("""</td>

  <td>
    <a href=""""),_display_(/*53.15*/routes/*53.21*/.HomeController.deleteProduct(p.getId)),format.raw/*53.59*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
      <span class="glyphicon glyphicon-trash"></span>
    </a>
  </td>
  </tr>
""")))}),format.raw/*58.2*/("""
  
  """),format.raw/*60.3*/("""</tbody>
  
  </table>

  <p>
    <a href=""""),_display_(/*65.15*/routes/*65.21*/.HomeController.addProduct()),format.raw/*65.49*/("""">
        <button class="btn btn-primary">Add a product</button>
    </a>

  </p>
  
  """)))}),format.raw/*71.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 09 19:54:14 GMT 2017
                  SOURCE: C:/Users/brand/Documents/WebLab/Lab8/CRUD-Labs/app/views/index.scala.html
                  HASH: a92f381837b7e2e490d5fa16385d13badc187b12
                  MATRIX: 962->1|1089->33|1117->36|1146->57|1185->59|1219->67|1290->113|1330->145|1368->146|1402->154|1472->198|1485->203|1520->218|1555->226|1596->237|1633->247|1972->560|2004->576|2044->578|2075->582|2118->599|2127->600|2154->606|2198->624|2207->625|2236->633|2280->651|2289->652|2325->667|2369->685|2378->686|2408->695|2474->734|2522->761|2580->792|2595->798|2654->836|2832->984|2867->992|2943->1041|2958->1047|3007->1075|3132->1170
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|46->14|71->39|71->39|71->39|72->40|74->42|74->42|74->42|76->44|76->44|76->44|78->46|78->46|78->46|80->48|80->48|80->48|82->50|82->50|85->53|85->53|85->53|90->58|92->60|97->65|97->65|97->65|103->71
                  -- GENERATED --
              */
          