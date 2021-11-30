package login;

import java.util.List;

public interface ILoginService
{
    boolean login(String brugerNavn, String kodeord);
    void logud();
    String hentAlleBrugere();
    List<Rolle> hentAlleRoller(String brugerNavn);
}
