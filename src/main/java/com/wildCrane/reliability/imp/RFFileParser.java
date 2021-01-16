package com.wildCrane.reliability.imp;

import com.wildCrane.reliability.entity.FileResult;
import com.wildCrane.reliability.parser.FileParser;

public class RFFileParser implements FileParser {
    @Override
    public FileResult parser(String path) {
        return new FileResult();
    }
}
