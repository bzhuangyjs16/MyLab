package com.wildCrane.reliability.parser;

import com.wildCrane.reliability.entity.FileResult;

public interface FileParser {
    FileResult parser(String path);
}
