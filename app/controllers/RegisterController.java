package controllers;

import models.User;
import play.data.*;
import play.mvc.*;

import views.html.*;

public class RegisterController extends Controller {
  
	static Form<User> userForm = Form.form(User.class);
	public static Result register() {
		  return ok(
		    views.html.register.render(userForm)
		  );
	}
  
}
