package br.com.caelum.vraptor.jetty;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

import javax.inject.Inject;

/**
 * Created by felipeweb on 27/03/15.
 */
@Controller
public class IndexController {
    private final Result result;

    /**
     * @deprecated CDI eyes only
     */
    protected IndexController() {
        this(null);
    }

    @Inject
    public IndexController(Result result) {
        this.result = result;
    }

    @Get("/")
    public void index() {
        result.include("mensagem", "Funciona!!!");
    }
}
