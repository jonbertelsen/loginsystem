package login;

public class Rolle
{
    private String rolleNavn;
    private String beskrivelse;

    public Rolle(String rolleNavn, String beskrivelse)
    {
        this.rolleNavn = rolleNavn;
        this.beskrivelse = beskrivelse;
    }

    public String getRolleNavn()
    {
        return rolleNavn;
    }

    public String getBeskrivelse()
    {
        return beskrivelse;
    }

    @Override
    public String toString()
    {
        return "Rolle{" +
                "rolleNavn='" + rolleNavn + '\'' +
                ", beskrivelse='" + beskrivelse + '\'' +
                '}';
    }
}
