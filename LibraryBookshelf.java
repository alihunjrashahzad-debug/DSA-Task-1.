import java.util.Scanner;

public class LibraryBookshelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter bookshelf capacity: ");
        int capacity = input.nextInt();
        int[] bookShelf = new int[capacity];
        int currentSize = 0, choice, index, bookID;

        do {
            System.out.println("----- LIBRARY BOOKSHELF MENU -----");
            System.out.println("1. Add new Book ID");
            System.out.println("2. Insert Book ID at specific index");
            System.out.println("3. Fill bookshelf");
            System.out.println("4. Delete last Book ID");
            System.out.println("5. Delete Book ID by index");
            System.out.println("6. Display all Book IDs");
            System.out.println("7. Search Book ID");
            System.out.println("8. Get Book ID at index");
            System.out.println("9. Replace/Update Book ID at index");
            System.out.println("10. Show current number of books");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (currentSize == capacity) System.out.println("Bookshelf is full!");
                    else {
                        System.out.print("Enter Book ID: ");
                        bookShelf[currentSize++] = input.nextInt();
                        System.out.println("Book ID added successfully.");
                    }
                    break;

                case 2:
                    if (currentSize == capacity) System.out.println("Bookshelf is full!");
                    else {
                        System.out.print("Enter index: ");
                        index = input.nextInt();
                        if (index < 0 || index > currentSize) System.out.println("Invalid index!");
                        else {
                            System.out.print("Enter Book ID: ");
                            bookID = input.nextInt();
                            for (int i = currentSize; i > index; i--) bookShelf[i] = bookShelf[i - 1];
                            bookShelf[index] = bookID;
                            currentSize++;
                            System.out.println("Book ID inserted successfully.");
                        }
                    }
                    break;

                case 3:
                    if (currentSize == capacity) System.out.println("Bookshelf is already full!");
                    else {
                        while (currentSize < capacity) {
                            System.out.print("Enter Book ID: ");
                            bookShelf[currentSize++] = input.nextInt();
                        }
                        System.out.println("Bookshelf is now full.");
                    }
                    break;

                case 4:
                    if (currentSize == 0) System.out.println("Bookshelf is empty!");
                    else {
                        System.out.println("Deleted Book ID: " + bookShelf[--currentSize]);
                        System.out.println("Last Book ID deleted successfully.");
                    }
                    break;

                case 5:
                    if (currentSize == 0) System.out.println("Bookshelf is empty!");
                    else {
                        System.out.print("Enter index to delete: ");
                        index = input.nextInt();
                        if (index < 0 || index >= currentSize) System.out.println("Invalid index!");
                        else {
                            System.out.println("Deleted Book ID: " + bookShelf[index]);
                            for (int i = index; i < currentSize - 1; i++) bookShelf[i] = bookShelf[i + 1];
                            currentSize--;
                            System.out.println("Book ID deleted successfully.");
                        }
                    }
                    break;

                case 6:
                    if (currentSize == 0) System.out.println("Bookshelf is empty!");
                    else {
                        System.out.println("\nBook IDs currently on shelf:");
                        for (int i = 0; i < currentSize; i++)
                            System.out.println("Index " + i + " = Book ID " + bookShelf[i]);
                    }
                    break;

                case 7:
                    if (currentSize == 0) System.out.println("Bookshelf is empty!");
                    else {
                        System.out.print("Enter Book ID to search: ");
                        int searchID = input.nextInt();
                        boolean found = false;
                        for (int i = 0; i < currentSize; i++) {
                            if (bookShelf[i] == searchID) {
                                System.out.println("Book ID found at index: " + i);
                                found = true;
                                break;
                            }
                        }
                        if (!found) System.out.println("Book ID not found!");
                    }
                    break;

                case 8:
                    System.out.print("Enter index: ");
                    index = input.nextInt();
                    if (index < 0 || index >= currentSize) System.out.println("Invalid index!");
                    else System.out.println("Book ID at index " + index + " is: " + bookShelf[index]);
                    break;

                case 9:
                    System.out.print("Enter index: ");
                    index = input.nextInt();
                    if (index < 0 || index >= currentSize) System.out.println("Invalid index!");
                    else {
                        System.out.print("Enter new Book ID: ");
                        bookShelf[index] = input.nextInt();
                        System.out.println("Book ID updated successfully.");
                    }
                    break;

                case 10:
                    System.out.println("Current number of books on shelf: " + currentSize);
                    break;

                case 11:
                    System.out.println("Exiting Library Bookshelf System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 11);
    }
}
