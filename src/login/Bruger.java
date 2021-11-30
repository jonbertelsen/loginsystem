package login;

public class Bruger
{
    private String navn;
    private String kodeord;

    public Bruger(String navn, String kodeord)
    {
        this.navn = navn;
        this.kodeord = kodeord;
    }

    public String getNavn()
    {
        return navn;
    }

    public String getKodeord()
    {
        return kodeord;
    }

    @Override
    public String toString()
    {
        return "Bruger{" +
                "navn='" + navn + '\'' +
                ", kodeord='" + kodeord + '\'' +
                '}';
    }
}
