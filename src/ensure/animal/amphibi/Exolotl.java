package ensure.animal.amphibi;

/**
 * @class Exolotl
 * Exolotl merupakan hewan yang berkelas Amphibi dan habitatnya di water dan darat.
 * Created by rayandrew on 3/27/2017.
 */
public class Exolotl extends Amphibi {
    /** @brief Constructor.
     * Melakukan inisialisasi kelas
     * @param x Posisi X.
     * @param y Posisi Y.
     * @param isTamed Menyatakan kejinakan Animal tersebut; false = ganas, true = jinak.
     * @param inputWeight Menyatakan berat Animal tersebut.
     * @param inputFoodType Menyatakan Animal tersebut Herbivore, Carnivore, atau Omnivore.
     * @param inputHabitat Menyatakan habitat Animal tersebut.
     */
    public Exolotl(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
        symbol = 'e';
    }

    public void interact(){
        System.out.println("Shhhhhhhh");
    }
}
