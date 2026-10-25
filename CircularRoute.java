import java.util.Scanner;
public class CircularRoute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String places[] = {"NMK", "SLM", "TRY", "KRR", "TNJ"};
        int distance[] = {100, 200, 150, 300, 250};
        int fare[] = {300, 500, 250, 150, 250};
        System.out.print("Enter source: ");
        String source = sc.next();
        System.out.print("Enter destination: ");
        String destination = sc.next();
        int sourceIndex = -1;
        int destinationIndex = -1;
        for (int i = 0; i < places.length; i++) {
            if (places[i].equalsIgnoreCase(source)) {
                sourceIndex = i;
            }
            if (places[i].equalsIgnoreCase(destination)) {
                destinationIndex = i;
            }
        }
        if (sourceIndex == -1 || destinationIndex == -1) {
            System.out.println("Invalid source or destination");
            return;
        }
        if (sourceIndex == destinationIndex) {
            System.out.println("Source and destination are same");
            return;
        }
        int current = sourceIndex;
        int totalDistance = 0;
        int totalFare = 0;
        System.out.println("\nRoute:");
        System.out.print(places[current]);
        while (current != destinationIndex) {
            int next = (current + 1) % places.length;
            totalDistance = totalDistance + distance[current];
            totalFare = totalFare + fare[current];
            current = next;
            System.out.print(" -> " + places[current]);
        }
        System.out.println();
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Fare: " + totalFare);
        sc.close();
    }
}