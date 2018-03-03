
public class Empresas
{
    //variaveis de instancia
    private int NIF;
    private String email;
    private String nome;
    private String morada;
    private String password;
    
    public EmpresasInfo ()
    {
        NIF=0;
        email="";
        nome="";
        morada="";
        password="";
    }
    public EmpresasInfo (int NIF, String email, String nome, String morada, String password)
    {
        this.NIF=NIF;
        this.email=email;
        this.nome=nome;
        this.morada=morada;
        this.password=password;
    }
    public EmpresasInfo (EmpresasInfo i)
    {
        this(i.getNIF(), i.getEmail(), i.getNome(), i.getMorada(), i.getPassword();
    }
    
    //metodos de instancia
    public int getNIF(){
        return this.NIF;
    }
    public String getEmail()
    {return this.email;
    }
    public String getNome(){
        return this.nome;
    }
    public String getMorada(){
        return this.morada;
    }
    public String getPassword(){
        return this.password;
    }
    
    public int setNIF(int NIF){
        this.NIF=NIF;
    }
    public String setEmail(String email){
        this.email=email;
    }
    public String setNome(String nome){
        this.nome=nome;
    }
    public String setMorada(String morada){
        this.morada=morada;
    }
    public String setPassword(String password){
        this.password=password;
    }
    
    public boolean equals(Object O){
        if (o==this) {return true;}
        if(o==null || o.getClass() != this.getClass()) {return false;}
        EmpresasInfo i = (EmpresasInfo) o;
        return i.getNIF().equals(NIF) &&
               f.getEmail().equals(email) &&
               f.getNome().equals(nome) &&
               f.getMorada().equals(morada) &&
               f.getPassword().equals(password);
    }
    
    public EmpresasInfo clone(){
        return new EmpresasInfo(this);
    }
}
