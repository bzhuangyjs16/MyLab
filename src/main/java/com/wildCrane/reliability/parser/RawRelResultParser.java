package com.wildCrane.reliability.parser;

import com.wildCrane.reliability.entity.ReliabilityParserResult;

import java.util.List;

public interface RawRelResultParser<R> {
   List<R> parser(ReliabilityParserResult reliabilityParserResult);
}
