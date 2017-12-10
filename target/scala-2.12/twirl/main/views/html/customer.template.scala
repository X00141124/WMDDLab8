
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""
"""),_display_(/*2.2*/main("Customer Page")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
  
  """),format.raw/*4.3*/("""<p class="lead">Customer Info</p>
  

  """),_display_(/*7.4*/if(flash.containsKey("success"))/*7.36*/{_display_(Seq[Any](format.raw/*7.37*/("""
    """),format.raw/*8.5*/("""<div class="alert alert-success">
      """),_display_(/*9.8*/flash/*9.13*/.get("success")),format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""</div>
""")))}),format.raw/*11.2*/("""

  """),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Address</th>
  
  <th>Number</th>
  
  <th>DOB</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*38.4*/for(p<-customers) yield /*38.21*/ {_display_(Seq[Any](format.raw/*38.23*/("""
  """),format.raw/*39.3*/("""<tr>
  
  <td>"""),_display_(/*41.8*/p/*41.9*/.getId),format.raw/*41.15*/("""</td>
  
  <td>"""),_display_(/*43.8*/p/*43.9*/.getName),format.raw/*43.17*/("""</td>
  
  <td>"""),_display_(/*45.8*/p/*45.9*/.getAddress),format.raw/*45.20*/("""</td>
  
  <td>"""),_display_(/*47.8*/p/*47.9*/.getNumber),format.raw/*47.19*/("""</td>
  
  <td>"""),_display_(/*49.8*/p/*49.9*/.getDob),format.raw/*49.16*/("""</td>

  <td>
    <a href=""""),_display_(/*52.15*/routes/*52.21*/.HomeController.deleteCustomer(p.getId)),format.raw/*52.60*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
      <span class="glyphicon glyphicon-trash"></span>
    </a>
  </td>
  </tr>
""")))}),format.raw/*57.2*/("""
  
  """),format.raw/*59.3*/("""</tbody>
  
  </table>
  
  <p>
    <a href=""""),_display_(/*64.15*/routes/*64.21*/.HomeController.addCustomer()),format.raw/*64.50*/("""">
        <button class="btn btn-primary">Add a customer</button>
    </a>

  </p>
  """)))}),format.raw/*69.4*/(""" """))
      }
    }
  }

  def render(customers:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 09 19:54:14 GMT 2017
                  SOURCE: C:/Users/brand/Documents/WebLab/Lab8/CRUD-Labs/app/views/customer.scala.html
                  HASH: 9654f8068200fe1aa6ace7500a608d1dcd1147e6
                  MATRIX: 966->1|1095->35|1123->38|1152->59|1191->61|1225->69|1294->113|1334->145|1372->146|1404->152|1471->194|1484->199|1519->214|1552->220|1591->229|1624->235|1958->543|1991->560|2031->562|2062->566|2105->583|2114->584|2141->590|2185->608|2194->609|2223->617|2267->635|2276->636|2308->647|2352->665|2361->666|2392->676|2436->694|2445->695|2473->702|2531->733|2546->739|2606->778|2784->926|2819->934|2897->985|2912->991|2962->1020|3084->1112
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|70->38|70->38|70->38|71->39|73->41|73->41|73->41|75->43|75->43|75->43|77->45|77->45|77->45|79->47|79->47|79->47|81->49|81->49|81->49|84->52|84->52|84->52|89->57|91->59|96->64|96->64|96->64|101->69
                  -- GENERATED --
              */
          