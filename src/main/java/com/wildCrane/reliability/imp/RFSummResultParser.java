package com.wildCrane.reliability.imp;

import com.wildCrane.reliability.entity.ReliabilityParserResult;
import com.wildCrane.reliability.entity.rf.TRFSummResult;
import com.wildCrane.reliability.parser.SummResultParser;

import java.util.ArrayList;
import java.util.List;

public class RFSummResultParser implements SummResultParser<TRFSummResult> {

    @Override
    public List<TRFSummResult> parser(ReliabilityParserResult reliabilityParserResult) {
        return new ArrayList<>();
    }
}
