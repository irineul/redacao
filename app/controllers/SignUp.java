package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;


import models.*;

public class SignUp extends Controller {

	final static Form<User> userForm = form(User.class);

	/**
	 * Display a blank form.
	 */ 
	public static Result blank() {
		return ok(views.html.signup.form.render(userForm));
	}

	/**
	 * Handle submit form
	 */ 
	public static Result submit() {
		Form<User> filledForm = userForm.bindFromRequest();
		if(filledForm.hasErrors()) {
			return badRequest(
					views.html.signup.form.render(userForm)
					);
		} else {
			User.create(filledForm.get());
			return ok();  
		}
	}	
}

