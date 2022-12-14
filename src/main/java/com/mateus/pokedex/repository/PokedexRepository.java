package com.mateus.pokedex.repository;

import com.mateus.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository <Pokemon, String>{
}
