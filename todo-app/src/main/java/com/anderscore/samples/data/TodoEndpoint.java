package com.anderscore.samples.data;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Endpoint
@AnonymousAllowed
public class TodoEndpoint {

    private List<TodoItem> items = new ArrayList<>();

    public TodoEndpoint() {
        items.add(new TodoItem("Lerne Lit", LocalDate.now(), true));
        items.add(new TodoItem("Lerne Hilla", null, false));
    }

    public @Nonnull List<@Nonnull TodoItem> getAllTodoItems() {
        return items;
    }
}
