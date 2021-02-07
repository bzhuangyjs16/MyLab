package com.wildCrane.reliability.parser.imp;

import com.wildCrane.reliability.entity.ReliabilityParserResult;
import com.wildCrane.reliability.entity.rf.TRFRawRelResult;
import com.wildCrane.reliability.parser.RawRelResultParser;

import java.util.ArrayList;
import java.util.List;

public class RFRawRelResultParser implements RawRelResultParser<TRFRawRelResult> {
    @Override
    public List<TRFRawRelResult> parser(ReliabilityParserResult reliabilityParserResult) {
        return new ArrayList<>();
    }
}
