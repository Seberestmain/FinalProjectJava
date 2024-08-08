import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("ASUS X515EA", 8, "Windows10", 40000, "Asus"));
        set.add(new Notebook("ASUS Vivobook 17X", 16, "Windows10", 85000, "Asus"));
        set.add(new Notebook("Lenovo IdeaPad Slim 5", 32, "linux", 90000, "Lenovo"));
        set.add(new Notebook("Acer Predator Helios", 64, "linux", 200000, "Acer"));
        set.add(new Notebook("HP 250 G9", 8, "Windows10", 60000, "HP"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}