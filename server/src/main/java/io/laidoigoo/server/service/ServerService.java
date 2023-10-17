package io.laidoigoo.server.service;

import java.util.Collection;

import io.laidoigoo.server.model.Server;

public interface ServerService {
    Server create(Server server);

    Collection<Server> list(int limit);

    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
}
