package reliability.parser;

import reliability.entity.ReliabilityParserResult;

import java.util.List;

public interface SummResultParser<S> {
    List<S> parser(ReliabilityParserResult reliabilityParserResult);
}
