package br.com.devjf.event_register.controller;

import br.com.devjf.event_register.model.Subscription;
import br.com.devjf.event_register.model.User;
import br.com.devjf.event_register.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {
    @Autowired
    private SubscriptionService service;

    @PostMapping("/subscription/{prettyName}")
    public ResponseEntity<Subscription> createNewSubscription(@PathVariable String prettyName, @RequestBody User subscriber) {
        Subscription result = service.createNewSubscription(prettyName, subscriber);
        if (result != null) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().build();
    }
    // 28:00
}
