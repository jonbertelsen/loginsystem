package login;

import java.util.ArrayList;
import java.util.List;

public class LoginServiceQuickAndDirty implements ILoginService
{
    private boolean loggedIn;

    public LoginServiceQuickAndDirty()
    {
        this.loggedIn = false;
    }

    @Override
    public boolean login(String brugerNavn, String kodeord)
    {
        if (brugerNavn.equals("jon") && kodeord.equals("b"))
        {
            loggedIn = true;
            return true;
        } else
        {
            return false;
        }
    }

    @Override
    public void logud()
    {
        loggedIn = false;
    }

    @Override
    public String hentAlleBrugere()
    {
        return "Alle brugere: Jon Bertelsen";
    }

    @Override
    public List<Rolle> hentAlleRoller(String brugerNavn)
    {
        List<Rolle> roller = new ArrayList<Rolle>();
        roller.add(new Rolle("admin", "guderollen"));
        roller.add(new Rolle("user", "fodtusse"));
        return roller;
    }
}
