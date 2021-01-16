package com.wildCrane.reliability.imp;

import com.wildCrane.reliability.entity.ReliabilityParserResult;
import com.wildCrane.reliability.entity.RunRecordResult;
import com.wildCrane.reliability.parser.RunRecordParser;

public class RFRunRecordParser implements RunRecordParser {
    @Override
    public RunRecordResult parser(ReliabilityParserResult reliabilityParserResult) {
        return new RunRecordResult();
    }
}
