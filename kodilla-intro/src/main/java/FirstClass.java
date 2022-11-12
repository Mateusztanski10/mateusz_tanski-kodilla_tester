public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2000, 2020);
        Notebook heavyNotebook = new Notebook(2000,500, 1995);
        Notebook oldNotebook = new Notebook(1600, 1500, 2010);

        displayNotebookParameters(notebook);
        displayNotebookParameters(heavyNotebook);
        displayNotebookParameters(oldNotebook);
    }

    private static void displayNotebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
    }
}