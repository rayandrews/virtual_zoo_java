package ensure.animal.amphibi;

/**
 * Created by Aldrich on 3/25/2017.
 * @class AfricanFrog is a type of amphibi
 */
public class AfricanFrog extends Amphibi {
    //methods
    public AfricanFrog(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public double getTotalFood() {
        return (double) (super.getWeight() * 0.01);
    }
    public void interact(){
        System.out.println("Kroakk!");
    }
}
