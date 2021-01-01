package reliability.parser;

import reliability.entity.ReliabilityParserResult;

import java.util.List;

public interface RawRelResultParser<R> {
   List<R> parser(ReliabilityParserResult reliabilityParserResult);
}
