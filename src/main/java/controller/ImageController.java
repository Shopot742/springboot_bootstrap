package controller;

import dao.ImageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageDAO imageDAO;

    @RequestMapping(value="/{name:.+}", method=RequestMethod.GET)
    public byte[] getImageByName(@PathVariable String name) {
        System.out.println(name);
        return imageDAO.findByFileExtension(name).getData();
    }

}