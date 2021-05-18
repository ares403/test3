package com.miniswing.prodservice.web.dto;

import com.miniswing.prodservice.domain.Prod;
import lombok.Getter;

@Getter
public class ProdListResponseDto {
    private String prodid;
    private String prodnm;
    private String coclcd;

    public ProdListResponseDto(Prod entity) {
        this.prodid = entity.getProdid();
        this.prodnm = entity.getProdnm();
        this.coclcd = entity.getCoclcd();
    }
}
