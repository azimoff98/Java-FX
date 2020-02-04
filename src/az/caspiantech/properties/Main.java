package az.caspiantech.properties;

import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Main {
    public static void main(String[] args) {
        IntegerProperty integerProperty = new SimpleIntegerProperty(5);
        integerProperty.set(6);

        IntegerProperty integerProperty1 = new ReadOnlyIntegerWrapper();
        integerProperty1.set(10);

        integerProperty.bindBidirectional(integerProperty1);


        //INSTEAD OF USING SOUT HERE WE ARE ADDING LISTENER TO VARIABLE AND EVERY TIME OUTPUT NEW VALUE OF VARIABLE
        //JAVA 8 FEATURES
        integerProperty.addListener((observable, oldValue, newValue) -> {
            System.out.println("New value = " + newValue);
        });

        integerProperty.set(45);
        integerProperty1.set(52);


        IntegerBinding integerBinding = new IntegerBinding() {
            {
                super.bind(integerProperty, integerProperty1);
            }
            @Override
            protected int computeValue() {
                return integerProperty.get() + integerProperty.get();
            }
        };


        IntegerBinding integerBinding1 = new IntegerBinding() {
            {
                super.bind(integerProperty, integerProperty1);
            }
            @Override
            protected int computeValue() {
                return integerProperty.get() + integerProperty.get();
            }
        };

        System.out.println(integerBinding.get());
    }
}
