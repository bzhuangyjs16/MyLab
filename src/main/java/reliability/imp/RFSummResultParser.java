package reliability.imp;

import reliability.entity.ReliabilityParserResult;
import reliability.entity.rf.TRFSummResult;
import reliability.parser.SummResultParser;

import java.util.ArrayList;
import java.util.List;

public class RFSummResultParser implements SummResultParser<TRFSummResult> {

    @Override
    public List<TRFSummResult> parser(ReliabilityParserResult reliabilityParserResult) {
        return new ArrayList<>();
    }
}
