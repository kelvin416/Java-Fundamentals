package labs_examples.enumerations.labs;

public class Exercise1AController {
    public static void main(String[] args) {
        BooksEnums fiction = new BooksEnums(Books.FICTION);
        fiction.booksToStudy();
        BooksEnums mystery = new BooksEnums(Books.MYSTERY);
        mystery.booksToStudy();
        BooksEnums motivational = new BooksEnums(Books.MOTIVATIONAL);
        motivational.booksToStudy();
        BooksEnums novel = new BooksEnums(Books.NOVEL);
        novel.booksToStudy();
        BooksEnums poetry = new BooksEnums(Books.POETRY);
        poetry.booksToStudy();
        BooksEnums historical = new BooksEnums(Books.HISTORICAL);
        historical.booksToStudy();

    }
}

enum Books{
    FICTION, MYSTERY, POETRY, NOVEL, HISTORICAL, MOTIVATIONAL
}

class BooksEnums{
    Books books;

    public BooksEnums(Books books) {
        this.books = books;
    }

    public void booksToStudy(){
        switch (books){
            case FICTION:
                System.out.println("Fictional portrays are inconsistent with history, facts, and or plausibility.");
                break;
            case NOVEL:
                System.out.println("A novel is a relatively long work of narrative fiction, typically written in \nprose and published as a book.");
                break;
            case POETRY:
                System.out.println("A form of literature that uses aesthetic and rhythmic qualities of a language.");
                break;
            case MYSTERY:
                System.out.println("Mystery is a fiction genre where the nature of an event, usually a murder or \nother crime, remains mysterious until the end of the story.");
                break;
            case HISTORICAL:
                System.out.println("Historical fiction is a literary genre in which the plot takes place in a \nsetting related to the past events, but is fictional.");
                break;
            case MOTIVATIONAL:
                System.out.println("Motivation books are guides for inciting action and getting things done.");
            default:
                System.out.println("No book here.");
        }
    }
}
