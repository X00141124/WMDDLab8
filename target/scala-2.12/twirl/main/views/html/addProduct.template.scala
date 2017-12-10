
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Product")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
"""),format.raw/*6.1*/("""<p class="lead">Add or update a new product</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.105*/ {_display_(Seq[Any](format.raw/*8.107*/("""
    
    """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

    """),_display_(/*12.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.81*/("""
    """),_display_(/*13.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*13.95*/("""
    """),_display_(/*14.6*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*14.83*/("""
    """),_display_(/*15.6*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*15.83*/("""

    """),_display_(/*17.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.70*/("""

    """),format.raw/*19.5*/("""<div class="actions">

        <input type="submit" value="Add/Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.index),format.raw/*22.46*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>

    </div>
""")))}),format.raw/*27.2*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 09 19:11:11 GMT 2017
                  SOURCE: C:/Users/brand/Documents/WebLab/Lab8/CRUD-Labs/app/views/addProduct.scala.html
                  HASH: cd606538e654d015002f468bd23f87cad06e1b16
                  MATRIX: 967->1|1075->41|1120->36|1150->58|1178->61|1205->80|1244->82|1272->84|1353->140|1461->239|1501->241|1540->254|1553->258|1584->268|1619->277|1715->352|1748->359|1858->448|1891->455|1989->532|2022->539|2120->616|2155->625|2240->689|2275->697|2427->822|2442->828|2484->849|2622->957
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|49->17|51->19|54->22|54->22|54->22|59->27
                  -- GENERATED --
              */
          