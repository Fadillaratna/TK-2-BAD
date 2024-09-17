import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Recruitment {
    public static void main(String[] args) {
        System.out.println("=================== Recruitment Group 7 ===================\n");
        printAvailablePositions();

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInput Nama Pelamar: ");
        String name = scanner.nextLine();

        String position;
        while (true) {
            System.out.print("Input Posisi: ");
            position = scanner.nextLine();
            if (isValidPosition(position)) {
                break;
            } else {
                System.out
                        .println("Posisi tidak valid. Silakan pilih antara Staff, Officer, Supervisor, atau Manager.");
            }
        }

        System.out.print("Input Tangal Lahir (YYYY-MM-DD): ");
        String birthDateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        Applicant applicant = new Applicant(name, position, birthDate);

        ageValidator(applicant);

    }

    public static void printAvailablePositions() {
        System.out.println("Posisi yang tersedia:");
        System.out.println("- Staff");
        System.out.println("- Officer");
        System.out.println("- Supervisor");
        System.out.println("- Manager");
    }

    public static boolean isValidPosition(String position) {
        List<String> validPositions = Arrays.asList("staff", "officer", "supervisor", "manager");
        return validPositions.contains(position.toLowerCase());
    }

    public static void ageValidator(Applicant applicant) {
        switch (applicant.getPosition().toUpperCase()) {
            case "STAFF":
                if (applicant.getAge() > 25) {
                    System.out.println(
                            "Pelamar pada posisi " + applicant.getPosition() + " atas nama " + applicant.getName()
                                    + " berusia " + applicant.getAge()
                                    + ", melebihi batas umur posisi tersebut. Maksimal 25 tahun!");
                } else {
                    System.out.println(
                            "Pelamar pada posisi " + applicant.getPosition() + " atas nama " + applicant.getName()
                                    + " berusia " + applicant.getAge() + ", memenuhi syarat!");
                }
                break;
            case "OFFICER":
                if (applicant.getAge() > 30) {
                    System.out.println(
                            "Pelamar pada posisi " + applicant.getPosition() + " atas nama " + applicant.getName()
                                    + " berusia " + applicant.getAge()
                                    + ", melebihi batas umur posisi tersebut. Maksimal 30 tahun!");
                } else {
                    System.out.println(
                            "Pelamar pada posisi " + applicant.getPosition() + " atas nama " + applicant.getName()
                                    + " berusia " + applicant.getAge() + ", memenuhi syarat!");
                }
                break;
            case "SUPERVISOR":
                if (applicant.getAge() > 35) {
                    System.out.println(
                            "Pelamar pada posisi " + applicant.getPosition() + " atas nama " + applicant.getName()
                                    + " berusia " + applicant.getAge()
                                    + ", melebihi batas umur posisi tersebut. Maksimal 35 tahun!");
                } else {
                    System.out.println(
                            "Pelamar pada posisi " + applicant.getPosition() + " atas nama " + applicant.getName()
                                    + " berusia " + applicant.getAge() + ", memenuhi syarat!");
                }
                break;
            case "MANAGER":
                if (applicant.getAge() > 40) {
                    System.out.println(
                            "Pelamar pada posisi " + applicant.getPosition() + " atas nama " + applicant.getName()
                                    + " berusia " + applicant.getAge()
                                    + ", melebihi batas umur posisi tersebut. Maksimal 40 tahun!");
                } else {
                    System.out.println(
                            "Pelamar pada posisi " + applicant.getPosition() + " atas nama " + applicant.getName()
                                    + " berusia " + applicant.getAge() + ", memenuhi syarat!");
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
