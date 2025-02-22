package br.com.devjf.event_register.service;

import br.com.devjf.event_register.model.Event;
import br.com.devjf.event_register.model.Subscription;
import br.com.devjf.event_register.model.User;
import br.com.devjf.event_register.repository.EventRepo;
import br.com.devjf.event_register.repository.SubscriptionRepo;
import br.com.devjf.event_register.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    @Autowired
    private EventRepo evtRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private SubscriptionRepo subRepo;

    public Subscription createNewSubscription(String eventName, User user) {
        // Get event by name
        Event evt = evtRepo.findByPrettyName(eventName);
        user = userRepo.save(user);

        Subscription subs = new Subscription();
        subs.setEvent(evt);
        subs.setSubscriber(user);

        Subscription result = subRepo.save(subs);
        return result;
    }
}
