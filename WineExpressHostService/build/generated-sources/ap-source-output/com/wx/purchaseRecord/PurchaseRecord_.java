package com.wx.purchaseRecord;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-03-13T08:54:45")
@StaticMetamodel(PurchaseRecord.class)
public class PurchaseRecord_ { 

    public static volatile SingularAttribute<PurchaseRecord, String> purchaseProductName;
    public static volatile SingularAttribute<PurchaseRecord, String> email;
    public static volatile SingularAttribute<PurchaseRecord, Date> purchaseDate;
    public static volatile SingularAttribute<PurchaseRecord, String> purchaseRecordId;

}