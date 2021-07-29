package com.solinftec.dev8api.util;

import com.solinftec.dev8api.requests.EquipmentPostRequestBody;
import com.solinftec.dev8api.requests.EquipmentPutRequestBody;

public class EquipmentPutRequestBodyFactoryUtil {

    public EquipmentPutRequestBody createEquipmentToBeSaved() {
        return EquipmentPutRequestBody.builder()
                .id(1L)
                .description("Triturador")
                .color("#FFFFFF")
                .latitude(90)
                .longitude(180)
                .build();
    }

    public EquipmentPutRequestBody createEquipmentWithoutColor() {
        return EquipmentPutRequestBody.builder()
                .id(1L)
                .description("Triturador")
                .latitude(90)
                .longitude(180)
                .build();
    }

    public EquipmentPutRequestBody createEquipmentWithColorNameInvalid() {
        return EquipmentPutRequestBody.builder()
                .id(1L)
                .description("Triturador")
                .color("amarela")
                .latitude(90)
                .longitude(180)
                .build();
    }
}
