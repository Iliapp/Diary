package com.ilya.backend.contoller;


import org.springframework.ui.Model;
import com.ilya.backend.model.Entry;
import com.ilya.backend.service.EntryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        entry.setUserId(UUID.fromString("11111111-1111-1111-1111-111111111111"));
        entryService.createEntry(entry);
        return "redirect:/entries";
    }
    // edit
    @GetMapping("/{id}/edit")
    public String editEntryForm(@PathVariable UUID id, Model model) {
        Entry entry = entryService.getEntryById(id);
        model.addAttribute("entry", entry);
        return "entry-form";
    }
    //update elments
    @PostMapping("/{id}/update")
    public String updateEntry(@PathVariable UUID id, @ModelAttribute Entry updateEntry) {
        entryService.updateEntry(id,updateEntry);
        return "redirect:/entries";
    }
    //delete elments
    @PostMapping("/{id}/delete")
    public String deleteEntryById(@PathVariable UUID id) {
        entryService.deleteEntry(id);
        return "redirect:/entries";
    }




}
