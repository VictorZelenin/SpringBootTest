package test.service;

import test.model.Website;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by victor on 19.10.16.
 */
@Service
public class WebsiteService {
    private static List<Website> items = new ArrayList<Website>();

    static {
        items.add(new Website("stackoverflow", "http://stackoverflow.com", "ICON", "StackOverflow","descr"));
    }

    public List<Website> findAll() {
        return items;
    }
}
