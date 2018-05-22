package com.example.recipes.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.example.recipes.commands.NotesCommand;
import com.example.recipes.domain.Notes;

@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommand>{

    @Nullable
    @Override
    public NotesCommand convert(Notes source) {
        if (source == null) {
            return null;
        }

        final NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(source.getId());
        notesCommand.setRecipeNotes(source.getRecipeNotes());
        return notesCommand;
    }
}
