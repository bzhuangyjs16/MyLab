package com.wildCrane.reliability.parser;

import com.wildCrane.reliability.entity.ReliabilityParserResult;
import com.wildCrane.reliability.entity.RunRecordResult;

public interface RunRecordParser {
    RunRecordResult parser(ReliabilityParserResult reliabilityParserResult);
}
