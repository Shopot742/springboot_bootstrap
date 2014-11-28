package controller;

import dao.CarouselDAO;
import dao.ImageDAO;
import domain.Carousel;
import domain.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    private CarouselDAO carouselDAO;
    @Autowired
    private ImageDAO imageDAO;

    @RequestMapping(value="/upload", method=RequestMethod.GET)
    public String provideUploadInfo() {
        return "You can upload a file by posting to this same URL.";
    }

    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                                 @RequestParam("title") String title){
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                Image img = new Image();
                img.setData(bytes);
                img.setFileNameWithExtention(file.getOriginalFilename());
                imageDAO.save(img);
                Carousel carousel = new Carousel(img,title);
                carouselDAO.save(carousel);
                return "You successfully uploaded ";
            } catch (Exception e) {
                return "You failed to upload ";
            }
        } else {
            return "You failed to upload because the file was empty.";
        }
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public String deleteCarousel(@PathVariable long id) {
        carouselDAO.delete(id);
        return "redirect:admin";
    }
}