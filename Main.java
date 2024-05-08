import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Llamadas de ejemplo con algunos los casos posibles
        ArrayList<Call> calls = new ArrayList<>();
        // Aca da igual la localidad y el pais como es local no afecta en el precio.
        calls.add(new Call(20, "local", "Country1", "Location1", "Monday", 10));
        calls.add(new Call(20, "local", "Country1", "Location1", "Monday", 7));

        // Aca da igual el dia, la hora y el pais como es nacional afecta en el precio.
        calls.add(new Call(30, "national", "Country1", "Location1", "Monday", 8));
        calls.add(new Call(10, "national", "Country1", "Location2", "Thursday", 13));

        // Aca da igual el dia, la hora y la localidad como es internacional no
        // afecta en el precio.
        calls.add(new Call(60, "international", "Country1", "Location1", "Monday", 10));
        calls.add(new Call(25, "international", "Country2", "Location1", "Monday", 7));

        // Factura de ejemplo con el parametro de el basico por mes.
        Facturation invoice = new Facturation(50, calls);
        invoice.generateInvoice();
    }
}