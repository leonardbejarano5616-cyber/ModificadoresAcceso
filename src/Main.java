import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        ArrayList<String> frutas = new ArrayList<>();

    frutas.add("Mango");
    frutas.add("Banano");
    frutas.add("Naranja");
    frutas.add(1, "Fresa");

    String primera = frutas.get(0);
    String segunda = frutas.get(1);

    frutas.set(0, "Papaya");

    frutas.remove(2);
    frutas.remove("Fresa");

    int cantidad = frutas.size();

    boolean tiene = frutas.contains("Naranja");
    boolean no = frutas.contains("Banano");

    System.out.println(frutas);
    }
    
}
