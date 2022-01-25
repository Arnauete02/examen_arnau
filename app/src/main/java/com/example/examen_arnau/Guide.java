package com.example.examen_arnau;

import java.util.ArrayList;

public class Guide {
    private String guideName;
    private String guideCity;
    private String guidePrice;
    private int guideImage;
    private String guideDesc;
    private ArrayList<Integer> guideImages;

    public Guide(String guideName, String guideCity, String guidePrice, int guideImage, String guideDesc, ArrayList<Integer> guideImages) {
        this.guideName = guideName;
        this.guideCity = guideCity;
        this.guidePrice = guidePrice;
        this.guideImage = guideImage;
        this.guideDesc = guideDesc;
        this.guideImages = guideImages;
    }

    public String getGuideImagesString(){
        String value = "";
        for (int i = 0; i < guideImages.size(); i++){
            if (i == 0){
                value = this.getGuideImagesString() + guideImages.get(i);
            } else {
                value = value + ", " + this.getGuideImagesString() + guideImages.get(i);
            }
        }
        return value;
    }

    public ArrayList<Integer> getGuideImages() {
        return guideImages;
    }

    public void setGuideImages(ArrayList<Integer> guideImages) {
        this.guideImages = guideImages;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getGuideCity() {
        return guideCity;
    }

    public void setGuideCity(String guideCity) {
        this.guideCity = guideCity;
    }

    public String getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(String guidePrice) {
        this.guidePrice = guidePrice;
    }

    public String getGuideImageString() {
        return "m" + guideImage;
    }

    public int getGuideImage() {
        return guideImage;
    }

    public void setGuideImage(int guideImage) {
        this.guideImage = guideImage;
    }

    public String getGuideDesc() {
        return guideDesc;
    }

    public void setGuideDesc(String guideDesc) {
        this.guideDesc = guideDesc;
    }
}
