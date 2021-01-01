package reliability;

import reliability.parser.SaveRelParserResult;

/**
 * 可靠性工厂类
 */
public class ReliabilityParser {
    public static ReliabilityParserBuilder setPath(String path){
        ReliabilityParserBuilder reliabilityParserBuilder = new ReliabilityParserBuilder(path);
        return reliabilityParserBuilder;
    }
}
