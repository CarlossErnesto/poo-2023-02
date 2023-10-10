public class TestaAnimais {

    public static void main(String[] args) {
        Animal[] bixos = new Animal[3];
        
        //Receba os bixos

        Sapo sapo = new Sapo();
        Cachorro cachorro = new Cachorro();
        Boi boi = new Boi();

        bixos[0] = sapo;
        bixos[1] = cachorro;
        bixos[2] = boi;

        for (Animal animal : bixos) {
            System.out.println(animal.som());
        }


    }
}