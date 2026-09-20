package by.tms.additionTask.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GoodsSupplyContract extends Document{

    private String productType;

    public int getQuantiliOfGoods() {
        return quantiliOfGoods;
    }

    public void setQuantiliOfGoods(int quantiliOfGoods) {
        this.quantiliOfGoods = quantiliOfGoods;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    private int quantiliOfGoods;

    public GoodsSupplyContract(){
        super();
    }

    public GoodsSupplyContract(String numberDocuments, String productType, int quantiliOfGoods, Date dateDocument){
        super(numberDocuments, dateDocument);
        this.productType = productType;
        this.quantiliOfGoods = quantiliOfGoods;

    }

    @Override
    public void  printInfo(){
        System.out.println("===========Контракт на поставку товалов===============");
        System.out.println("Номер документа: " + getNumberDocuments());
        System.out.println("Тип товара: " + getProductType());
        System.out.println("Кличество товара: " + getQuantiliOfGoods());
        System.out.println("Дата документа: " + getDateDocument()) ;
        System.out.println("========================================================");
    }
}
