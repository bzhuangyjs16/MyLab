package reliability.parser;

import reliability.entity.ReliabilityParserResult;
import reliability.entity.RunRecordResult;

public interface RunRecordParser {
    RunRecordResult parser(ReliabilityParserResult reliabilityParserResult);
}
