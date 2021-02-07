package com.wildCrane.reliability;

import com.wildCrane.reliability.entity.FileResult;
import com.wildCrane.reliability.entity.ReliabilityParserResult;
import com.wildCrane.reliability.entity.RunRecordResult;
import com.wildCrane.reliability.entity.rf.TRFRawRelResult;
import com.wildCrane.reliability.entity.rf.TRFSummResult;
import com.wildCrane.reliability.parser.*;

import java.util.List;

/**
 * 可靠性构建器
 */
public class ReliabilityParserBuilder<R, S> {
    private String path;

    private ReliabilityParserResult reliabilityParserResult;

    public ReliabilityParserBuilder(String path,ReliabilityParserResult reliabilityParserResult) {
        this.path = path;
        this.reliabilityParserResult = reliabilityParserResult;
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

    public ReliabilityParserBuilder setRawRelResult(RawRelResultParser rawRelResultParser) {
        List<TRFRawRelResult> rawRelResults = rawRelResultParser.parser(reliabilityParserResult);
        reliabilityParserResult.setRawRelResults(rawRelResults);
        return this;
    }

    public ReliabilityParserBuilder setSmmResults(SummResultParser summResultParser) {
        List<TRFSummResult> summResults = summResultParser.parser(reliabilityParserResult);
        reliabilityParserResult.setSummResults(summResults);
        return this;
    }

    public void save(SaveRelParserResult saveRelParserResult) {
        saveRelParserResult.save(reliabilityParserResult);
    }
}


















