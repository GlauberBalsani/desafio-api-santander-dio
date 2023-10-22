package com.balsani.dioapisantanderaccount.domain.model;

import java.math.BigDecimal;

public interface Card {
    Long getId();
    String number();
    BigDecimal limit();
}
