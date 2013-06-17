package controllers;

import play.mvc.*;

import views.html.*;

public class LoginController extends Controller {
  
    public static Result login() {
    	return ok("It works!");
    }
  
}
