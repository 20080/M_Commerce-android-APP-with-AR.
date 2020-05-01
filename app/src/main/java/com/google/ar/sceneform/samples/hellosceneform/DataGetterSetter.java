package com.google.ar.sceneform.samples.hellosceneform;

public class DataGetterSetter {


    public DataGetterSetter(int productImage, String pdNamel, String pdDes, String pdPrice) {
        this.productImage = productImage;
        PdNamel = pdNamel;
        this.pdDes = pdDes;
        this.pdPrice = pdPrice;

    }

    private int productImage;
    private String PdNamel;
    private String pdDes;
    private String pdPrice;

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getPdNamel() {
        return PdNamel;
    }

    public void setPdNamel(String pdNamel) {
        PdNamel = pdNamel;
    }

    public String getPdDes() {
        return pdDes;
    }

    public void setPdDes(String pdDes) {
        this.pdDes = pdDes;
    }

    public String getPdPrice() {
        return pdPrice;
    }

    public void setPdPrice(String pdPrice) {
        this.pdPrice = pdPrice;
    }
}



