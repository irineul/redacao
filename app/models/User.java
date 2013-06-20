package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;


@Entity
public class User extends Model {

	@Id
	public Long id;
	
	@Required
	public String name;
	
	@Required
	public String email;
	
	@Required
	public String password;
	
	@Required
	public String repeatPassword;	

	public static Finder<Long,User> find = new Finder(
			Long.class, User.class
			);	

	public static List<User> all() {
		return new ArrayList<User>();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void seteMmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	/* CRUD operations */
	public static void create(User user) {
		user.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}	
}
