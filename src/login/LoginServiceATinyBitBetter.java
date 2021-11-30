package login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginServiceATinyBitBetter implements ILoginService
{
    private boolean loggedIn;
    private Map<String, Bruger> brugere;

    public LoginServiceATinyBitBetter()
    {
        this.loggedIn = false;
        brugere = new HashMap<>();
        brugere.put("jon", new Bruger("jon", "b"));
        brugere.put("sebastian", new Bruger("sebastian", "s"));
        brugere.put("otto", new Bruger("otto", "o"));
    }

    @Override
    public boolean login(String brugerNavn, String kodeord)
    {
        Bruger bruger = brugere.get(brugerNavn);

        if (bruger != null)
        {
            if (brugerNavn.equals(bruger.getNavn()) && kodeord.equals(bruger.getKodeord()))
            {
                loggedIn = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public void logud()
    {
        loggedIn = false;
    }

    @Override
    public String hentAlleBrugere()
    {
        String result ="";

        for (Bruger value : brugere.values())
        {
            result += value.getNavn() + "\n";
        }
        return "Alle brugere: \n" + result;
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
