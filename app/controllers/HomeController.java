package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.*;
import javax.inject.Inject;

import models.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        List<Product> productList = Product.findAll();
        return ok(index.render(productList));
    }
    public Result customer() {
        List<Customer> customerList = Customer.findAll();
        return ok(customer.render(customerList));
    }
    public Result addProduct(){
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm));
    }

    public Result addCustomer(){
        Form<Customer> customerForm = formFactory.form(Customer.class);
        return ok(addCustomer.render(customerForm));
    }

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }

    public Result addProductSubmit(){

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm));
        } else {
            Product newProduct = newProductForm.get();
            newProduct.save();
            flash("success", "Product "+ newProduct.getName() + " was added");
            return redirect(controllers.routes.HomeController.index());
        }
    }

    public Result addCustomerSubmit(){
        
                Form<Customer> newCustomerForm = formFactory.form(Customer.class).bindFromRequest();
        
                if (newCustomerForm.hasErrors()) {
                    return badRequest(addCustomer.render(newCustomerForm));
                } else {
                    Customer newCustomer = newCustomerForm.get();
                    newCustomer.save();
                    flash("success", "Customer "+ newCustomer.getName() + " was added");
                    return redirect(controllers.routes.HomeController.customer());
                }
            }

            public Result deleteProduct(Long id){
                Product.find.ref(id).delete();
                flash("success", "Product has been deleted");
                return redirect(routes.HomeController.index());
            }

            public Result deleteCustomer(Long id){
                Customer.find.ref(id).delete();
                flash("success", "Customer has been deleted");
                return redirect(routes.HomeController.customer());
            }
}
