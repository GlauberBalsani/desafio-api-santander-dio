package com.balsani.dioapisantanderaccount.domain.model;

import java.math.BigDecimal;


public interface Account {
    String getNumber();
    String getAgency();
    BigDecimal getBalnce();
    BigDecimal getLimit();
}
