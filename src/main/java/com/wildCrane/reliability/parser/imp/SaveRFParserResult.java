package com.wildCrane.reliability.parser.imp;

import com.wildCrane.reliability.entity.ReliabilityParserResult;
import com.wildCrane.reliability.parser.SaveRelParserResult;

public class SaveRFParserResult implements SaveRelParserResult {

    @Override
    //Transaction
    public void save(ReliabilityParserResult reliabilityParserResult) {
        // 1、判断是否已经插入run表，否则向run表中插入信息，得到runId
        // 2、判断是否已经插入file表，否则向file表插入信息(runId)，得到fileId
        // 3、向result表插入信息（fileId,runId）
        // 4、向summ表插入信息（fileId,runId）
    }
}
