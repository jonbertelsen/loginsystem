package login;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    //private static ILoginService loginService = new LoginServiceQuickAndDirty();
    private static ILoginService loginService = new LoginServiceATinyBitBetter();

    public static void main(String[] args) {

        System.out.println("Indtast brugernavn:");
        String brugerNavn = input.nextLine();
        System.out.println("Indtast kodeord");
        String kodeord = input.nextLine();

        if (loginService.login(brugerNavn, kodeord))
        {
            System.out.println("Du er hermed logget på");
        } else
        {
            System.out.println("Den gik ikke Granberg");
        }
        System.out.println(loginService.hentAlleBrugere());

    }
}
