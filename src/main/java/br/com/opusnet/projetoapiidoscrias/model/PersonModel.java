package br.com.opusnet.projetoapiidoscrias.model;

import javafx.scene.image.Image;

public class PersonModel {

    private double valueAtack;
    private double name;

    private Image assetImage;

    public PersonModel(double valueAtack, double name, Image assetImage) {
        this.valueAtack = valueAtack;
        this.name = name;
        this.assetImage = assetImage;
    }

    public double getValueAtack() {
        return valueAtack;
    }

    public void setValueAtack(double valueAtack) {
        this.valueAtack = valueAtack;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public Image getAssetImage() {
        return assetImage;
    }

    public void setAssetImage(Image assetImage) {
        this.assetImage = assetImage;
    }
}
