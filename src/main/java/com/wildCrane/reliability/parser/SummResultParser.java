package com.wildCrane.reliability.parser;

import com.wildCrane.reliability.entity.ReliabilityParserResult;

import java.util.List;

public interface SummResultParser<S> {
    List<S> parser(ReliabilityParserResult reliabilityParserResult);
}
