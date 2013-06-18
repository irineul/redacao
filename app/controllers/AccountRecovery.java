package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;


import models.*;

public class AccountRecovery extends Controller {

	/**
	 * Display a blank form.
	 */ 
	public static Result blank() {
		return ok(views.html.signin.recovery.form.render());
	}

	/**
	 * Handle submit form
	 */ 
	public static Result submit() {
		return ok(views.html.signin.recovery.form.render());
	}
    
}
