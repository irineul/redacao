package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Redacao;
import play.mvc.Content;
import play.mvc.Controller;
import play.mvc.Result;

public class InternalController extends Controller {
  
    public static Result index() {
	    List<Redacao> redacoes = new ArrayList<Redacao>();
	    Redacao r = new Redacao();
	    r.setTitle("Teste1");
	    redacoes.add(r);
	    r = new Redacao();
	    r.setTitle("Teste2");
	    redacoes.add(r);
	    r = new Redacao();
	    r.setTitle("Teste3");
	    redacoes.add(r);
	    Content content = views.html.widgets.table.render(redacoes);
        return ok(content);
    }
  
}
