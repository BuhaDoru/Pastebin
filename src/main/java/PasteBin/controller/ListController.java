package PasteBin.controller;


import PasteBin.model.Note;
import PasteBin.service.ListService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Blob;
import java.util.List;


@RestController
@RequestMapping(path="/paste")
public class ListController {
    @Autowired
    private ListService listService;


    @PostMapping("/add")
    public ModelAndView redirectPostToPost(@ModelAttribute Note note) {
        System.out.println(note.toString());
        listService.saveList(note);
        return new ModelAndView("redirect:/allPaste.html");
    }


        @GetMapping("/getAll")
        public List<Note> getAllNotes() {
            return listService.getAllNotes();
    }

    @DeleteMapping(path="/delete/{id}")
        public void deleteNote(@PathVariable Integer id) {
        Note note = listService.deleteById(id);
    }
}