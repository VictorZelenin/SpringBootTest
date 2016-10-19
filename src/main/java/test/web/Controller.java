package test.web;

import test.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.service.WebsiteService;

import java.util.List;

/**
 * Created by victor on 19.10.16.
 */
@RestController
@RequestMapping("/api/stackoverflow")
public class Controller {

    @Autowired
    private WebsiteService stackoverflowService;

    @RequestMapping
    public List<Website> getListOfProviders() {
        return stackoverflowService.findAll();
    }
}
