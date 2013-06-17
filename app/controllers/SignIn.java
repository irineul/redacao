package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

public class SignIn extends Controller {
  
	final static Form<SignIn> loginForm = form(SignIn.class);
	
	public static Result blank() {
		  return ok("Opa");
	}
    
}
