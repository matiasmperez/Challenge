import java.util.ArrayList;

public class Facturation {
    private double basicMonthlyPass;
    private ArrayList<Call> calls;
    private int totalLocal = 0;
    private int totalInternational = 0;
    private int totalNational = 0;

    public Facturation(double basicMonthlyPass, ArrayList<Call> calls) {
        this.basicMonthlyPass = basicMonthlyPass;
        this.calls = calls;
    }

    public double getBasicMonthlyPass() {
        return basicMonthlyPass;
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }

    public void setBasicMonthlyPass(double basicMonthlyPass) {
        this.basicMonthlyPass = basicMonthlyPass;
    }

    public void setCalls(ArrayList<Call> calls) {
        this.calls = calls;
    }

    public double calculateTotal() {
        double totalCost = 0;
        for (Call call : calls) {
            if (call.getType().equals("local")) {
                totalLocal++;
                switch (call.getDay()) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        switch (call.getHour()) {
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                totalCost += call.getDuration() * 0.2;
                                break;
                            default:
                                totalCost += call.getDuration() * 0.1;
                                break;
                        }
                        break;
                    default:
                        totalCost += call.getDuration() * 0.1;
                        break;
                }
            }
            if (call.getType().equals("national")) {
                totalNational++;
                switch (call.getLocation()) {
                    case "Location1":
                        totalCost += call.getDuration() * 0.3;
                        break;
                    case "Location2":
                        totalCost += call.getDuration() * 0.4;
                        break;
                    case "Location3":
                        totalCost += call.getDuration() * 0.5;
                        break;
                    default:
                        totalCost += call.getDuration() * 0.6;
                        break;
                }
            }
            if (call.getType().equals("international")) {
                totalInternational++;
                switch (call.getCountry()) {
                    case "Country1":
                        totalCost += call.getDuration() * 0.7;
                        break;
                    case "Country2":
                        totalCost += call.getDuration() * 0.8;
                        break;
                    case "Country3":
                        totalCost += call.getDuration() * 0.9;
                        break;
                    default:
                        totalCost += call.getDuration() * 0.1;
                        break;
                }
            }
        }
        return totalCost;
    }

    public void generateInvoice() {
        double total = basicMonthlyPass + calculateTotal();

        System.out.println("Monthly invoice");
        System.out.println("Basic monthly pass: " + basicMonthlyPass);
        System.out.println("Number of local calls: " + totalLocal);
        System.out.println("Number of national calls: " + totalNational);
        System.out.println("Number of international calls: " + totalInternational);
        System.out.println("----------------------");
        System.out.println("Total ammount: $" + total);
    }
}
