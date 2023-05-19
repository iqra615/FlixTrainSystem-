package net.javaguides.fms.controller;

import net.javaguides.fms.entity.Flix;
import net.javaguides.fms.service.FlixService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlixController {

        private FlixService flixService;

   public FlixController(FlixService flixService){
       super();
       this.flixService=flixService;
   }

   @GetMapping("/Flix")
    public String listFlix(Model model) {
       model.addAttribute("flix",flixService.getAllFlix());
       return "flix";
   }




    @GetMapping("/first")
    public String first_page_flix(Model model) {
        model.addAttribute("flix",flixService.getAllFlix());
        return "first_page_flix";
    }





    @GetMapping("/list")
    public String list_train(){
       return "list_train";
    }



   @GetMapping("/flix/new")
    public String createFlixForm(Model model) {
       Flix flix= new Flix();
       model.addAttribute("flix",flix);
       return "create_flix";
   }



   @PostMapping("/flix")
   public String saveFlix(@ModelAttribute("flix") Flix flix){
       flixService.saveFlix(flix);
       return "redirect:/flix";
   }







   @GetMapping("/flix/edit/{id}")
   public String editFlixForm(@PathVariable Long id, Model model){
       model.addAttribute("flix", flixService.getFlixById(id));
       return "edit_flix";
   }


   @PostMapping("/flix/{id}")
    public String updateFlix(@PathVariable Long id,
                                  @ModelAttribute("flix") Flix flix,
                                  Model model)
   {

       //get student from db by id
       Flix existingFlix = flixService.getFlixById(id);
       existingFlix.setPassengerName(flix.getPassengerName());
       existingFlix.setPassengerEmail(flix.getPassengerEmail());
       existingFlix.setBookingNumber(flix.getBookingNumber());
       existingFlix.setTicketPrice(flix.getTicketPrice());

       //save update passenger object

       flixService.updateFlix(existingFlix);
       return "redirect:/flix";

   }


    @GetMapping("/flix/{id}")
    public String deleteFlix(@PathVariable Long id){
        flixService.deleteFlixById(id);
        return "redirect:/flix";
    }


}
