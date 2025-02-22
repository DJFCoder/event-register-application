package br.com.devjf.event_register.repository;

import br.com.devjf.event_register.model.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepo extends CrudRepository<Subscription, Integer> {}
