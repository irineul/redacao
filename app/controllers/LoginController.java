package controllers;

import models.User;
import play.data.*;
import play.mvc.*;

import views.html.*;

public class LoginController extends Controller {
  
	static Form<User> userForm = Form.form(User.class);
	public static Result login() {
		  return ok(
		    views.html.login.render(userForm)
		  );
	}
}
