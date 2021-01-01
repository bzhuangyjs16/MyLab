package reliability.imp;

import reliability.entity.ReliabilityParserResult;
import reliability.entity.rf.TRFRawRelResult;
import reliability.parser.RawRelResultParser;

import java.util.List;

public class RFRawRelResultParser implements RawRelResultParser<TRFRawRelResult> {
    @Override
    public List<TRFRawRelResult> parser(ReliabilityParserResult reliabilityParserResult) {
        return null;
    }
}
