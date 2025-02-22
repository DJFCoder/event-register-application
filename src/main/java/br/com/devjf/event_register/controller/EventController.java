package br.com.devjf.event_register.controller;

import br.com.devjf.event_register.model.Event;
import br.com.devjf.event_register.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventService service;

    @PostMapping("/events")
    public Event addNewEvent(@RequestBody Event newEvent) {
        return service.addNewEvent(newEvent);
    }

    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return service.getAllEvents();
    }

    @GetMapping("/events/{prettyName}")
    public ResponseEntity<Event> getByPrettyName(@PathVariable String prettyName) {
        Event evt = service.getByPrettyName(prettyName);
        if (evt != null) {
            return ResponseEntity.ok().body(evt);
        }
        return ResponseEntity.notFound().build();
    }
}