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
	@MinLength(value = 4)
	public String eMail;
	
	@Required
	public String password;

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
	public String geteMmail() {
		return eMail;
	}
	public void seteMmail(String eMmail) {
		this.eMail = eMmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/* CRUD operations */
	public static void create(User user) {
		user.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}	
}
