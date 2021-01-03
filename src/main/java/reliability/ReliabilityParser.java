package reliability;

import reliability.entity.ReliabilityParserResult;
import reliability.parser.SaveRelParserResult;

/**
 * 可靠性工厂类
 */
public class ReliabilityParser {
    public static ReliabilityParserBuilder setPath(String path, ReliabilityParserResult reliabilityParserResult){
        ReliabilityParserBuilder reliabilityParserBuilder = new ReliabilityParserBuilder(path,reliabilityParserResult);
        return reliabilityParserBuilder;
    }
}
