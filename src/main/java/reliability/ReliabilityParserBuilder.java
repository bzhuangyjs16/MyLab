package reliability;

import reliability.entity.FileResult;
import reliability.entity.ReliabilityParserResult;
import reliability.entity.RunRecordResult;
import reliability.parser.*;

import java.util.List;

/**
 * 可靠性构建器
 */
public class ReliabilityParserBuilder<R,S> {
    private String path;

    private ReliabilityParserResult reliabilityParserResult;

    private SaveRelParserResult saveRelParserResult;

    public ReliabilityParserBuilder(String path) {
        this.path = path;
    }

    public ReliabilityParserBuilder setFileResult(FileParser fileParser) {
        FileResult fileParserResult = fileParser.parser(path);
        reliabilityParserResult.setFileResults(fileParserResult);
        return this;
    }

    public ReliabilityParserBuilder setRunRecordResult(RunRecordParser runRecordParser) {
        RunRecordResult runRecordResult = runRecordParser.parser(reliabilityParserResult);
        reliabilityParserResult.setRunRecordResults(runRecordResult);
        return this;
    }

    public ReliabilityParserBuilder setRawRelResult(RawRelResultParser<R> rawRelResultParser){
        List<R> rawRelResults = rawRelResultParser.parser(reliabilityParserResult);
        reliabilityParserResult.setRawRelResults(rawRelResults);
        return this;
    }

    public ReliabilityParserBuilder setSmmResults(SummResultParser<S> summResultParser){
        List<S> summResults = summResultParser.parser(reliabilityParserResult);
        reliabilityParserResult.setSummResults(summResults);
        return this;
    }

    public void save(SaveRelParserResult saveRelParserResult) {
        saveRelParserResult.save(reliabilityParserResult);
    }
}


















