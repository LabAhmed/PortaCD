public class PortaCD {
    CD dischi[];
    int max_num_cd;

    public PortaCD(int numero){
        max_num_cd = numero;
        dischi = new CD[max_num_cd];
    }
    
    public PortaCD(PortaCD pcd){
        max_num_cd = pcd.max_num_cd;
        dischi = new CD[max_num_cd];
        for (int i = 0; i < max_num_cd; i++) {
            if (pcd.dischi[i] !=null) {
                dischi[i] = new CD(pcd.dischi[i]);
            }
        }
    }
    public PortaCD(CD[] d){
        max_num_cd = d.length;
        dischi = new CD[max_num_cd];
        for (int i = 0; i < max_num_cd; i++) {
            if (d[i] !=null) {
                dischi[i] = new CD(d[i]);
            }
        }
    }
    public int setCD(int posizione, CD c){
        int ce=-1;
        if(posizione<max_num_cd && posizione>=0){
            if (dischi[posizione] == null) {
                dischi[posizione] = new CD(c);
                ce=posizione;
            }else{
                ce=-2;
            }
        }
        return ce;
    }

    public CD getCD(int posizione){
        if (posizione>=0 && posizione<max_num_cd) {
            if (dischi[posizione] !=null) {
                return new CD(dischi[posizione]);
            }else return null;
        }else return null;
    }

    public int killCD(int posizione){
        int ce= -1;
        if (posizione>=0 && posizione<max_num_cd) {
            if (dischi[posizione] !=null) {
                dischi[posizione] = null;
                ce = posizione;
            }else{
                ce=-2;
            }
        }
        return ce;
    }
    public int getNumMaxDischi(){
        return max_num_cd;
    }

    public int getN(){
        int num=0;
        for(int i=0; i<max_num_cd; i++){
            if (dischi[i] != null) {
                num++;
            }
        }
        return num;
    }

    public int cercaCDperTitolo(String titolo){
        int i=0;
        boolean trovato = false;
        while (i<max_num_cd && trovato == false) {
            if (dischi[i]!=null ) {
                if (dischi[i].getTitolo().equals(titolo)) {
                    trovato = true;
                }else{
                    i++;
                } 
            }else{
                i++;
            }
        }
        if (trovato == false ) {
            i=-1;
        }
        return i;
    }

    public String toString(){
        String s="";
        for (int i = 0; i < max_num_cd; i++) {
            s+=dischi[i].toString();
            s+="\n";
        }
        return s;
    }

    public boolean ConfrontaTuttaColezione(PortaCD pcd){
        boolean trovato = true;
        int x=0;
        while (trovato==true && x< max_num_cd) {
            int i =0;
            while (i<pcd.max_num_cd && trovato==true)
            if (dischi[x]!=null && pcd.dischi[i]!=null) {
                if ((!dischi[x].equals(pcd.dischi[i]) && i>= max_num_cd)) {
                    trovato = false;
                }else{
                    i++;
                }
            }else{
                i++;
            }
            x++;
        }

        return trovato;
    }
    public int confrontaCollezione(PortaCD pcd){
        int c=0;
        for (int i = 0; i < max_num_cd; i++) {
            for (int index = 0; index < pcd.dischi.length; index++) {
                if (dischi[i]!=null && pcd.dischi[index]!=null) {
                    if (dischi[i].equals(pcd.dischi[index])) {
                        c++;
                    } 
                } 
            }
            
            
        }
        return c;
    }
}
