package com.ilya.backend.contoller;


import org.springframework.ui.Model;
import com.ilya.backend.model.Entry;
import com.ilya.backend.service.EntryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/entries")

public class EntryController {

    private final EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }
    //Get all elements
    @GetMapping
    public String getAllEntries(Model model) {
        model.addAttribute("entries", entryService.getAllEntry());
        return "entries"; // entries.html
    }
    //Get by id
    @GetMapping("/new")
    public String newEntryForm(Model model) {
        model.addAttribute("entry", new Entry());
        return "entry-form"; // entry-form.html
    }
    //create elements
    @PostMapping
    public String saveEntry(@ModelAttribute Entry entry) {
        entryService.createEntry(entry);
        return "redirect:/entries";
    }
    //update elments
    @PutMapping("/{id}")
    public Entry updateEntry(@PathVariable UUID id, @RequestBody Entry updateEntry) {
        return entryService.updateEntry(id, updateEntry);
    }
    //delete elments
    @DeleteMapping("/{id}")
    public void deleteEntryById(@PathVariable UUID id) {
        entryService.deleteEntry(id);
    }




}
