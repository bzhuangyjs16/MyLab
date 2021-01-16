package com.wildCrane.reliability;

import com.wildCrane.reliability.entity.ReliabilityParserResult;

/**
 * 可靠性工厂类
 */
public class ReliabilityParser {
    public static ReliabilityParserBuilder setPath(String path, ReliabilityParserResult reliabilityParserResult){
        ReliabilityParserBuilder reliabilityParserBuilder = new ReliabilityParserBuilder(path,reliabilityParserResult);
        return reliabilityParserBuilder;
    }
}
