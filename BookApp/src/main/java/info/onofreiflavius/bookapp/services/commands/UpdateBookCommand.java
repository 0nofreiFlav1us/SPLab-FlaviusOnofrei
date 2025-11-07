package info.onofreiflavius.bookapp.services.commands;

import info.onofreiflavius.bookapp.models.Book;
import info.onofreiflavius.bookapp.services.Command;
import info.onofreiflavius.bookapp.services.CommandContext;

public class UpdateBookCommand implements Command<Book> {
    private final CommandContext context;
    private final Integer id;
    private final Book updatedBook;

    public UpdateBookCommand(CommandContext context, Integer id, Book updatedBook) {
        this.context = context;
        this.id = id;
        this.updatedBook = updatedBook;
    }

    @Override
    public Book execute() {
        Book existing = context.getBooksRepository().findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        existing.setTitle(updatedBook.getTitle());
        existing.setAuthors(updatedBook.getAuthors());
        // update other fields
        return context.getBooksRepository().save(existing);
    }
}

