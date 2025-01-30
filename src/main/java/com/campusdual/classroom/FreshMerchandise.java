package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date expirationDate) {
        if (expirationDate == null) {
            return "Fecha no disponible";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(expirationDate);
    }

    @Override
    public String getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ").append(getLocation());
        builder.append(" | ");
        builder.append("Fecha de caducidad: ").append(getFormattedDate(expirationDate));
        return builder.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }

    // Getter para expirationDate
    public Date getExpirationDate() {
        return expirationDate;
    }
}
