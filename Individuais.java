import java.util.ArrayList;
import java.lang.System.out;

public class Individuais
{
    //variaveis de instancia
    private int NIF;
    private String email;
    private String nome;
    private String morada;
    private String password;
    
    //construtores
    public IndividuaisInfo ()
    {
        NIF=0;
        email="";
        nome="";
        morada="";
        password="";
    }
    public IndividuaisInfo (int NIF, String email, String nome, String morada, String password)
    {
        this.NIF=NIF;
        this.email=email;
        this.nome=nome;
        this.morada=morada;
        this.password=password;
    }
    public IndiciduaisInfo (IndividuaisInfo i)
    {
        this(i.getNIF(), i.getEmail(), i.getNome(), i.getMorada(), i.getPassword();
    }
    
    //metodos de instancia
    public int getNIF() {return this.NIF;}
    public String getEmail() {return this.email;}
    public String getNome() {return this.nome;}
    public String getMorada() {return this.morada;}
    public String getPassword() {return this.password;}
    
    public void setNIF() {this.NIF=NIF;}
    public String setEmail() {this.email=email;}
    public String setNome() {this.nome=nome;}
    public String setMorada() {this.morada=morada;}
    public String setPassword() {this.password=password;}
    public boolean equals(Object O)
    {
        if (o==this) {return true;}
        if(o==null || o.getClass() != this.getClass()) {return false;}
        IndividuaisInfo i = (IndividuaisInfo) o;
        return i.getNIF().equals(NIF) &&
               f.getEmail().equals(email) &&
               f.getNome().equals(nome) &&
               f.getMorada().equals(morada) &&
               f.getPassword().equals(password);
    }
    
    public IndividuaisInfo clone() {return new IndividuaisInfo(this);}
    
