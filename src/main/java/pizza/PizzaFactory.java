package pizza;

import java.util.List;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type, double cost, List<String> components){
        if(type == PizzaType.CAPRICIOSA){
            return new CapriciosaPizza(cost,components);
        }else if(type == PizzaType.HAWAI){
            return new HawaiPizza(cost,components);
        }else if(type == PizzaType. MARGHERITA){
            return new MargheritaPizza(cost,components);
        }else if(type == PizzaType.DIABOLIC){
            return new DiabolicPizza(cost, components);
        }else{
            throw new IllegalPizzaTypeException("Illegal type of pizza");
        }
    }
}
