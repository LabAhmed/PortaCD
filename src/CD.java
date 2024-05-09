public class CD {
    private String titolo;
    private String autore;
    private int brani;
    private int durata;

    public CD(String titolo, String autore, int brani, int durata){
        this.titolo = titolo;
        this.autore = autore;
        this.brani = brani;
        this.durata = durata;
    }

    public CD(){}

    public CD(CD c){
        this(c.titolo, c.autore, c.brani, c.durata );
    }

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String nuovoTit){
        this.titolo = nuovoTit;
    }
    
    public String getAutore(){
        return autore;
    }

    public void setAutore(String nuovoAut){
        this.autore = nuovoAut;
    }

    public int getBrani(){
        return brani;
    }

    public void setBrani(int nuovoB){
        this.brani = nuovoB;
    }
    public int getDurata(){
        return durata;
    }

    public void setDurata(int nuovoD){
        this.durata = nuovoD;
    }

    public int compareDurata(CD c){
        int si;
        if(this.durata == c.durata){
            si  = 0;
        }else if(this.durata>c.durata){
            si=1;
        }else{
            si=-1;
        }
        return si;
    }

    public boolean equals(CD c){
        boolean uguali = false;
        if(c == null){
            uguali = false;
        }else{
            if (this.titolo.equals(c.titolo)&&this.autore.equals(c.autore)&&this.brani == c.brani && this.durata == c.durata) {
                uguali = true;
            }
        }
        return uguali;
    }

    public boolean equals(Object o){
        boolean uguali = false;
        if (this == o) {
            uguali=true;
        }else if(o instanceof CD){
            if (this.equals(o)) {
                uguali = true;
            }
        }
        return uguali;
    }

    public String toString(){
        String s="";
        s=" Titolo: "+titolo+"\n Autore: "+autore+"\n Brani: "+brani+"\n Durata complessiva: "+durata+"\n";
        return s;
    }
}
