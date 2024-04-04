/*package seedu.address.logic.commands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;
import static seedu.address.testutil.TypicalIndexes.INDEX_SECOND_PERSON;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.AddressBook;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.book.Book;
import seedu.address.model.person.Person;
import seedu.address.testutil.PersonBuilder;

public class BorrowCommandTest {

    private static final String BORROW_STUB = "Some bookTitle";

    private Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs(), null);
    private String bookTitle = "Ash";

    @Test
    public void execute_addBorrowUnfilteredList_success() {
        Person firstPerson = model.getFilteredPersonList().get(INDEX_SECOND_PERSON.getZeroBased());
        Person editedPerson = new PersonBuilder(firstPerson).withBooks(BORROW_STUB).withMeritScore(0).build();
        BorrowCommand borrowCommand = new BorrowCommand(INDEX_SECOND_PERSON,
                new Book(bookTitle));

        String expectedMessage = String.format(BorrowCommand.MESSAGE_ADD_BORROW_SUCCESS, editedPerson);

        Model expectedModel = new ModelManager(new AddressBook(model.getAddressBook()), new UserPrefs(), null);
        expectedModel.setPerson(firstPerson, editedPerson);

        assertCommandSuccess(borrowCommand, model, expectedMessage, expectedModel);
    }

    @Test
    public void execute_addBorrowUnfilteredList_unsuccess() {
        Person modelPerson = model.getFilteredPersonList().get(INDEX_FIRST_PERSON.getZeroBased());
        Person editedPerson = new PersonBuilder(modelPerson).withBooks(BORROW_STUB).withMeritScore(-1).build();

        BorrowCommand borrowCommand = new BorrowCommand(INDEX_FIRST_PERSON,
                new Book(bookTitle));

        assertThrows(CommandException.class, Messages.MESSAGE_INSUFFICIENT_MERIT_SCORE, () ->
                borrowCommand.execute(model));
    }
}*/
