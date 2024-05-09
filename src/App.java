public class App {
    public static void main(String[] args) throws Exception {
        CD c1 = new CD("Canzone1", "Gigi", 5, 120);
        CD c2 = new CD("Canzone2", "Gigi", 7, 120);
        CD c3 = new CD("Canzone3", "Gigi", 3, 57);
        System.out.println(c1.compareDurata(c3));
        PortaCD pcd =new PortaCD(4);
        System.out.println(pcd.setCD(0, c1));
        System.out.println(pcd.setCD(1, c2));
        System.out.println(pcd.setCD(2,  c3));
        // System.out.println(pcd.getCD(0));
        // System.out.println(pcd.getN());
        // System.out.println(pcd.killCD(3));
        // System.out.println(pcd.getN());
        // System.out.println(pcd.cercaCDperTitolo("Canzone01"));
        PortaCD pcd1 = new PortaCD(4);
        System.out.println(pcd1.setCD(0, c1));
        System.out.println(pcd1.setCD(1, c2));
        System.out.println(pcd1.setCD(2, c3));
        c3.setAutore("Chiara");
        // System.out.println(pcd.getCD(2));
        // System.out.println(pcd1.getCD(2));
        // System.out.println(pcd1.confrontaCollezione(pcd));
        if (pcd.ConfrontaTuttaColezione(pcd1)) {
            System.out.println("uguali");
        }else{
            System.out.println("erroe");
        }


    }
}
