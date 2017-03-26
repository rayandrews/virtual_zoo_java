package ensure.animal.amphibi;

/**
 * Created by Aldrich on 3/25/2017.
 * @class FlyingFish is a type of amphibi
 */
public class FlyingFish extends Amphibi {
    //methods
    public FlyingFish(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.01);
    }
    public void interact(){
        System.out.println("Swush!");
    }
}
