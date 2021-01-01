package reliability.parser;

import reliability.entity.FileResult;

public interface FileParser {
    FileResult parser(String path);
}
